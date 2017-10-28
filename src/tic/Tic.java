//Ayush Verma 
//Btech 3rd Year IT
//MNNIT Allahabad
//Created : July,2016


/*Tic Tac Toe*/
/*No use of minimax*/
/*Brute force implementation*/
/*Single Player,Two player*/
/*Modes - Normal,Timer */
/*Difficulty - Easy,Hard*/
/*Statistics for WINS/LOSS/DRAWS*/

/*Multiplayer Implementation not done yet*/

package tic;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class Tic extends javax.swing.JFrame 
{
 Timer start_load,time_load;
 
 int c=-1;
 
 char a[][]=new char[3][3];//3 by 3 array for storing 'X' and 'O'
 
 int i,j,p=0,t,q=0,e=0,f=0,x=0,n=0,k=0,m=0,tim=0,seconds=3;
 
 int r[]={11,13,31,33,22,12,21,23,32};//Positions for filling the array (1 indexed)
 
 int un1=0,un2=0;//Flag variables for 1st undo and 2nd undo
  
 int win1=0,loss1=0,draw1=0;//Storing wins,losses and draws respectively.
 static int prog=0;
    public Tic() 
    {
        
        initComponents();
        start.show();
        start_button.setVisible(false);
        game.hide();
        mode.hide();
        stat.hide();
        player.hide();
        names.hide();
        normal.hide();
       start_load=new Timer(10,new load_start());
       time_load=new Timer(1000,new load_time());
       start_load.start();
       
    
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));
    }


   private class load_start implements ActionListener //For loading the current start 
   {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            prog=progress.getValue();
            if(prog<100)
            {
              prog++;
              progress.setValue(prog);
            }
            else
            {
                start_load.stop();
                 start_button.setVisible(true);
        }
    
}
   }
   
   private class load_time implements ActionListener//For timer mode in game
   {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(seconds>0)
            {
              seconds--;
             sec.setText("0"+seconds);
            }
            else
            {
            seconds=3;
            sec.setText("03");
           rand1();
        }
}
   }
   
public void call()
{
 start.hide();
 game.show();
String b[]={"First","Second"};
c= JOptionPane.showOptionDialog(null, "Want to play first or second?", "Choice",
JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
null, b,b[0]);
if(c==-1)
System.exit(0);
 restart();
}
    
public void restart()
{
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
a[i][j]='.';
}     
p=0;
t=0;
q=0;
e=0;
f=0;
x=0;
n=0;
k=0;
un1=0;
un2=0;
b1.setText("");
b2.setText("");
b3.setText("");
b4.setText("");
b5.setText("");
b6.setText("");
b7.setText("");
b8.setText("");
b9.setText("");
time_load.stop();
if(tim==1)
{
seconds=3;
sec.setText("03");
undo.setEnabled(false);
}
else
sec.setText("00");
if(c==2)
{
playername.setText(s1.getText());
turn.setText("X");
}
if(c==1)
{
playername.setText("YOUR TURN");
turn.setText("O");
}
if(c==0)
{
playername.setText("YOUR TURN");
turn.setText("X");
}
if(c==1)    
get(b1,-1);
if(tim==1)
time_load.start();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mode = new javax.swing.JPanel();
        easy = new javax.swing.JButton();
        hard = new javax.swing.JButton();
        stat1 = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        stat = new javax.swing.JPanel();
        win = new javax.swing.JTextField();
        loss = new javax.swing.JTextField();
        draw = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        game = new javax.swing.JPanel();
        restart = new javax.swing.JButton();
        undo = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        playername = new javax.swing.JTextField();
        turn = new javax.swing.JTextField();
        min = new javax.swing.JLabel();
        colon = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        start = new javax.swing.JPanel();
        start_button = new javax.swing.JButton();
        progress = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        player = new javax.swing.JPanel();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        back3 = new javax.swing.JButton();
        names = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        player1 = new javax.swing.JTextField();
        player2 = new javax.swing.JTextField();
        s1 = new javax.swing.JTextField();
        s2 = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        back2 = new javax.swing.JButton();
        normal = new javax.swing.JPanel();
        norm = new javax.swing.JButton();
        timer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic-Tac-Toe");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        mode.setBackground(new java.awt.Color(102, 255, 255));

        easy.setBackground(new java.awt.Color(51, 255, 255));
        easy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        easy.setText("EASY MODE");
        easy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyActionPerformed(evt);
            }
        });

        hard.setBackground(new java.awt.Color(0, 255, 255));
        hard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hard.setText("HARD MODE");
        hard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardActionPerformed(evt);
            }
        });

        stat1.setBackground(new java.awt.Color(0, 255, 255));
        stat1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stat1.setText("STATISTICS");
        stat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stat1ActionPerformed(evt);
            }
        });

        back1.setBackground(new java.awt.Color(0, 255, 255));
        back1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back1.setText("BACK");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modeLayout = new javax.swing.GroupLayout(mode);
        mode.setLayout(modeLayout);
        modeLayout.setHorizontalGroup(
            modeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modeLayout.createSequentialGroup()
                .addGroup(modeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modeLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(modeLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(modeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hard)
                            .addComponent(easy, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stat1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        modeLayout.setVerticalGroup(
            modeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modeLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(easy, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hard, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stat1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        win.setEditable(false);
        win.setBackground(new java.awt.Color(102, 255, 255));
        win.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        win.setText("WINS:0");

        loss.setEditable(false);
        loss.setBackground(new java.awt.Color(102, 255, 255));
        loss.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loss.setText("LOSSES:0");

        draw.setEditable(false);
        draw.setBackground(new java.awt.Color(102, 255, 255));
        draw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        draw.setText("DRAWS:0");

        back.setBackground(new java.awt.Color(102, 255, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statLayout = new javax.swing.GroupLayout(stat);
        stat.setLayout(statLayout);
        statLayout.setHorizontalGroup(
            statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(statLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(draw)
                            .addComponent(loss)
                            .addComponent(win, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        statLayout.setVerticalGroup(
            statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statLayout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(win, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loss, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        game.setBackground(new java.awt.Color(51, 255, 255));

        restart.setBackground(new java.awt.Color(0, 255, 255));
        restart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        restart.setText("RESTART");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        undo.setBackground(new java.awt.Color(0, 255, 255));
        undo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        undo.setText("UNDO");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(0, 255, 255));
        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(0, 255, 255));
        b2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(0, 255, 255));
        b3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(0, 255, 255));
        b4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(0, 255, 255));
        b5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(0, 255, 255));
        b6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(0, 255, 255));
        b9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(0, 255, 255));
        b7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(0, 255, 255));
        b8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        playername.setEditable(false);
        playername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playername.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        turn.setEditable(false);
        turn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        turn.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        min.setFont(min.getFont().deriveFont(min.getFont().getStyle() | java.awt.Font.BOLD, min.getFont().getSize()+34));
        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setText("00");

        colon.setFont(colon.getFont().deriveFont(colon.getFont().getStyle() | java.awt.Font.BOLD, colon.getFont().getSize()+34));
        colon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colon.setText(":");

        sec.setFont(sec.getFont().deriveFont(sec.getFont().getStyle() | java.awt.Font.BOLD, sec.getFont().getSize()+34));
        sec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sec.setText("03");

        javax.swing.GroupLayout gameLayout = new javax.swing.GroupLayout(game);
        game.setLayout(gameLayout);
        gameLayout.setHorizontalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameLayout.createSequentialGroup()
                        .addComponent(turn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(playername)
                        .addGroup(gameLayout.createSequentialGroup()
                            .addComponent(restart, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, gameLayout.createSequentialGroup()
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, gameLayout.createSequentialGroup()
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(gameLayout.createSequentialGroup()
                            .addGap(0, 7, Short.MAX_VALUE)
                            .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(gameLayout.createSequentialGroup()
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(gameLayout.createSequentialGroup()
                                    .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(colon)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(54, 54, 54))))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        gameLayout.setVerticalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colon, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(sec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playername, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(turn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        start.setBackground(new java.awt.Color(255, 255, 255));
        start.setMinimumSize(new java.awt.Dimension(100, 100));
        start.setPreferredSize(new java.awt.Dimension(349, 480));

        start_button.setBackground(new java.awt.Color(0, 255, 255));
        start_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        start_button.setText("START");
        start_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_buttonActionPerformed(evt);
            }
        });

        progress.setStringPainted(true);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tic/download-001.jpg"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tic/images 2.png"))); // NOI18N

        javax.swing.GroupLayout startLayout = new javax.swing.GroupLayout(start);
        start.setLayout(startLayout);
        startLayout.setHorizontalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(startLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(start_button, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(startLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addGroup(startLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        startLayout.setVerticalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(start_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        player.setBackground(new java.awt.Color(51, 255, 255));

        one.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        one.setText("ONE PLAYER");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        two.setText("TWO PLAYERS");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        back3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back3.setText("BACK");
        back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout playerLayout = new javax.swing.GroupLayout(player);
        player.setLayout(playerLayout);
        playerLayout.setHorizontalGroup(
            playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerLayout.createSequentialGroup()
                .addGroup(playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(two)
                            .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(playerLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(back3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        playerLayout.setVerticalGroup(
            playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(back3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        names.setBackground(new java.awt.Color(51, 255, 255));

        name.setEditable(false);
        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setText("ENTER NAMES");

        player1.setEditable(false);
        player1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        player1.setText("PLAYER 1:");

        player2.setEditable(false);
        player2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        player2.setText("PLAYER 2:");

        s1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        s1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                s1KeyPressed(evt);
            }
        });

        s2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ok.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        back2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back2.setText("BACK");
        back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout namesLayout = new javax.swing.GroupLayout(names);
        names.setLayout(namesLayout);
        namesLayout.setHorizontalGroup(
            namesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(namesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(namesLayout.createSequentialGroup()
                        .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s2))
                    .addGroup(namesLayout.createSequentialGroup()
                        .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(namesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(namesLayout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 108, Short.MAX_VALUE))
                            .addComponent(s1))))
                .addGap(18, 18, 18))
            .addGroup(namesLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(namesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        namesLayout.setVerticalGroup(
            namesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namesLayout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(namesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(player1)
                    .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(namesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(player2)
                    .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(back2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        normal.setBackground(new java.awt.Color(102, 255, 255));

        norm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        norm.setText("NORMAL MODE");
        norm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normActionPerformed(evt);
            }
        });

        timer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timer.setText("TIMER MODE");
        timer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout normalLayout = new javax.swing.GroupLayout(normal);
        normal.setLayout(normalLayout);
        normalLayout.setHorizontalGroup(
            normalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(normalLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(normalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(norm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        normalLayout.setVerticalGroup(
            normalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(normalLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(norm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(start, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(stat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(names, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(normal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(stat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(names, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(normal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(416, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

public void get(JButton button,int loc)
{
    
if(c==0)//If user plays first
{
n=providen(loc);
n=check2(a,n);
if(n==0)
{
JOptionPane.showMessageDialog(null,"Position Already Occupied");
return;
}
button.setText("X");
a[(n/10)-1][(n%10)-1]='X';
un1=n;
x++;

if(m==0)//For easy mode it will pick any random position to move or it will play according to hard mode
{
int d=(int)(Math.random()*2);
if(d==0)
{
rand(a,'O');
if(verdict(a,'O')>0)
{
if(c==1)
{
game.hide();
mode.hide();
player.hide();
normal.show();
}
else
System.exit(0);
return;
}
return ;
}
}

if(verdict(a,'O')>0)
{
if(c==1)
{
game.hide();
mode.hide();
player.hide();
normal.show();
}
else
System.exit(0);
return;
}

if((n!=22) && (x==1))//If middle position is not occupied
{
a[1][1]='O';
b5.setText("O");
un2=22;
x++;
p=n;
}

else if(n==22 && x==1)//If middle position occupied then make move in the corners
{
q=r[(int)(Math.random()*4)];
providebutton((q/10)-1,(q%10)-1,"O");
a[(q/10)-1][(q%10)-1]='O';
x++;
}

else
{

if(((q==11 && n==33)||(q==33 && n==11)||(q==13 && n==31)||(q==31 && n==13))&&(x==3))
{
/*First move user has made it in the middle and then it has made in the corner opposite to the computer's O
O . . | X . . | . . X | . . O
. X . | . X . | . X . | . X .
. . X | . . O | O . . | X . .
*/
//Then make a move in one of the remaining corners
t=r[(int)(Math.random()*4)];
while(t==q || t==n)
t=r[(int)(Math.random()*4)];
providebutton((t/10)-1,(t%10)-1,"O");
a[(t/10)-1][(t%10)-1]='O';
x++;
}

else if(((p%10==n/10)||(p/10==n%10))&&(x==3)&&(p!=11)&&(p!=13)&&(p!=31)&&(p!=33)&&(n!=11)&&(n!=13)&&(n!=31)&&(n!=33))
{
/*
If first move user moves in these positions and second move diagonally adjacent 
.  12  .
21 .   23
.  32  . 
    
. X . | . X .  |  . . . |  . . .
X O . | . O X  |  . O X |  X O .
. . . | . . .  |  . X . |  . X .   
*/
//Then make a move in the corner common to both these positions
a[(p/10)+(n/10)-3][(p%10)+(n%10)-3]='O';
providebutton((p/10)+(n/10)-3,(p%10)+(n%10)-3,"O");
x++;
}

else if(get(a,'O')==1);//If computer finds a position that is winnable
else
{
k=counter(a,'X','O');//Counter that position if that position is winnable 
if(k==1)
x++;
if(x==3)
{ 
int b=r[5+(int)(Math.random()*4)];
if((p==11 && n==33)||(p==33 && n==11)||(p==13 && n==31)||(p==31 && n==13))
/* X . . | . . X
   . O . | . O .
   . . X | X . . 
Then make a move in one of these positions
.   12  .
21  .   23
.   32  . 
    */
;
else if((p==21 && n==23)||(p==23 && n==21)||(p==12 && n==32)||(p==32 && n==12))
{
/*
. . . | . X .   
X O X | . O . 
. . . | . X .
Then make a move in one of the corners
*/ 
b=r[(int)(Math.random()*4)];
}
else
{
/* . X . | . X .  |  . . X |  . . . | . . X | X . . | X . . | . . .
   . O . | . O .  |  X O . |  X O . | . O . | . O . | . O X | . O X
   X . . | . . X  |  . . . |  . . X | . X . | . X . | . . . | X . .
In these cases make a move in one of these positions whichever is empty
    .   12  .
    21  .   23
    .   32  . 
*/
int tw=-1;
if(n==12||n==21||n==23||n==32)
{
tw=n;
n=p;
p=tw;
}
while(((b%10)==(n%10))||((b/10)==(n/10))||p==b)
b=r[5+(int)(Math.random()*4)];
if(tw!=-1)
{
p=n;
n=tw;
}
}
a[(b/10)-1][(b%10)-1]='O';
providebutton(b/10-1,b%10-1,"O");
x++;
}

else
{
if(k==0&&fill(a,'O')==1)//If counter fails and above conditions fail then fill function is called
x++;
}
}
}

if(verdict(a,'O')>0)//Check verdict
{
if(c==1)
{
game.hide();
mode.hide();
player.hide();
normal.show();
}
else
System.exit(0);
return;
} 
}

else if(c==1)//If user plays second
{
    
if(x==0)
{
//First move will be in the one of the corners or in the middle 
n=r[(int)(Math.random()*5)];
un2=n;
a[(n/10)-1][(n%10)-1]='X';
providebutton(n/10-1,n%10-1,"X");
x++;
p=n;
return ;
}

n=providen(loc);
n=check2(a,n);
if(n==0)
{
JOptionPane.showMessageDialog(null,"Position Already Occupied");
return;
}
a[(n/10)-1][(n%10)-1]='O';
providebutton(n/10-1,n%10-1,"O");
un1=n;
x++;
playername.setText("YOUR TURN");
turn.setText("O");

if(verdict(a,'X')>0)
{
if(c==1)
{
game.hide();
mode.hide();
player.hide();
normal.show();
}
else
System.exit(0);
return;
}

if(m==0)//For easy mode
{
int d=(int)(Math.random()*2);

if(d==0)
{
rand(a,'X');
if(verdict(a,'X')>0)
{
if(c==1)
{
game.hide();
mode.hide();
player.hide();
normal.show();
}
else
System.exit(0);
return;
}
return ;
}
}

if(p==22 && x==2)//If first move is in the middle by computer
{
if(n==12||n==21||n==23||n==32)
{
/*If user moves in these positons
    .   12  .
    21  .   23
    .   32  . 
   . O . | . . .  |  . . . |  . . .
   . X . | . X .  |  O X . |  . X O 
   . . . | . O .  |  . . . |  . . . 
In these cases make a move in any of the 4 corners
*/
t=r[(int)(Math.random()*4)];
a[(t/10)-1][(t%10)-1]='X';
x++;
}
else if(n==11||n==13||n==31||n==33)
{
//If user moves in one of the corners then make a move in corner opposite to that corner
if(n==11)
t=33;
else if(n==13)
t=31;
else if(n==31)
t=13;
else 
t=11;
a[(t/10)-1][(t%10)-1]='X';
x++;
}
providebutton(t/10-1,t%10-1,"X");
}

else if(n==22 &&x==2)
{
/*If computer's first move is in the corner and user moves in the middle 
then make a move in corner opposite to that corner*/
if(p==11)
t=33;
else if(p==13)
t=31;
else if(p==31)
t=13;
else 
t=11;
a[(t/10)-1][(t%10)-1]='X';
x++;
providebutton(t/10-1,t%10-1,"X");
}

else if((n==11|| n==13||n==31||n==33)&&(x==2))
{
/*If computer's first move is in the corner and user moves in one of the corner
then make a move in any of the 2 remaining corners*/
t=r[(int)(Math.random()*4)];
while(t==p||t==n)
t=r[(int)(Math.random()*4)];
a[(t/10)-1][(t%10)-1]='X';
providebutton(t/10-1,t%10-1,"X");
x++;
}

else if(((p%10)==(n%10)||(((p%10)+2)==(n%10))||((p%10)==((n%10)+2)))&&(x==2))
{
/*Suppose X is placed in this corner
X . .
. . .
. . .
Then these condition will check whether O is in these cases
X . . | X . .
O . . | . . O
. . . | . . . 
Similarly for other corners    
Then make a move in the adjacent corner such that when user moves to 
counter the computer move no two O's will be in same line*/
if(p%10==1)
{
a[(p/10)-1][(p%10)+1]='X';
providebutton(p/10-1,p%10+1,"X");
}
else
{
a[(p/10)-1][(p%10)-3]='X';
providebutton(p/10-1,p%10-3,"X");
}
x++;
}

else if(((p/10)==(n/10)||(((p/10)+2)==(n/10))||((p/10)==((n/10)+2)))&&(x==2))
{
/*Suppose X is placed in this corner
X . .
. . .
. . .
Then these condition will check whether O is in these cases
X O . | X . .
. . . | . . .
. . . | . O . 
Similarly for other corners    
Then make a move in the adjacent corner such that when user moves to 
counter the computer move no two O's will be in same line*/
if(p/10==1)
{
a[(p/10)+1][(p%10)-1]='X';
providebutton(p/10+1,p%10-1,"X");
}
else
{
a[(p/10)-3][(p%10)-1]='X';
providebutton(p/10-3,p%10-1,"X");
}
x++;
}

else if(get(a,'X')==1);
else
{
k=counter(a,'O','X');
if(k==1)
x++;

if(x==4)
{
/*If these marked 'a' positions are empty then make move in corner which contains 'a'
 . a a | a a . | . . . | . . .
 . . a | a . . | a . . | . . a
 . . . | . . . | a a . | . a a */
if(a[0][1]=='.'&&a[1][0]=='.'&&a[0][0]=='.')
{
a[0][0]='X';
providebutton(0,0,"X");
}
else if(a[0][1]=='.'&&a[1][2]=='.'&&a[0][2]=='.')
{
a[0][2]='X';
providebutton(0,2,"X");
}
else if(a[2][0]=='.'&&a[1][0]=='.'&&a[2][1]=='.')
{
a[2][0]='X';
providebutton(2,0,"X");
}
else if(a[2][2]=='.'&&a[1][2]=='.'&&a[2][1]=='.')
{
a[2][2]='X';
providebutton(2,2,"X");
}
x++;
}

else
{
if(k==0&&fill(a,'X')==1)
x++;
}
}

if(verdict(a,'X')>0)
{
if(c==1)
{
game.hide();
mode.hide();
player.hide();
normal.show();
}
else
System.exit(0);
return;
}
}


else//For two players
{
n=providen(loc);
n=check2(a,n);
if(n==0)
{
JOptionPane.showMessageDialog(null,"Position Already Occupied");
return;
}
else 
{
if(x%2==0)//First player turn if x is even
{
button.setText("X");
a[n/10-1][n%10-1]='X';
playername.setText(s2.getText());
turn.setText("O");
}
else
{
button.setText("O");
a[n/10-1][n%10-1]='O';
playername.setText(s1.getText());
turn.setText("X");
}
x++;
if(verdict(a,'X')>0)
{
if(c==1)
{
game.hide();
mode.hide();
player.hide();
normal.show();
}
else
System.exit(0);
return;
}
}
}

if(x==9)//When all places are filled DRAW
{
time_load.stop();
String qw[]={"RESTART","CLOSE"};
if(c!=2)
{
draw1++;
draw.setText("DRAWS:"+draw1);
}
c= JOptionPane.showOptionDialog(null, "DRAW\nWant to play again?", "RESULT",
JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
null, qw,qw[0]);
c=c+1;
if(c==1)
{
game.hide();
mode.hide();
player.hide();
normal.show();
}
else
System.exit(0);  
return;
}

}

public void rand(char a[][],char e)//For easy mode it will pick any random position to move which is not occupied
{
int ran=-1;
if(x==9)
{
time_load.stop();
String qw[]={"RESTART","CLOSE"};
c= JOptionPane.showOptionDialog(null, "DRAW\nWant to play again?", "RESULT",
JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
null, qw,qw[0]);
draw1++;
draw.setText("DRAWS:"+draw1);
c=c+1;
if(c==1)
{
game.hide();
mode.hide();
player.hide();
normal.show(); 
}
else
System.exit(0);  
return;
}
while(true)
{
ran=r[(int)(Math.random()*9)];
if(a[ran/10-1][ran%10-1]=='.')
{
a[ran/10-1][ran%10-1]=e;
providebutton(ran/10-1,ran%10-1,""+e);
x++;
break;
}
}
}

public void rand1()
{
int ran=-1;
while(true)
{
ran=r[(int)(Math.random()*9)];
if(a[ran/10-1][ran%10-1]=='.')
{
int c=ran/10-1;
int d=ran%10-1;
if(c==0&&d==0)
get(b1,1);
if(c==0&&d==1)
get(b2,2);
if(c==0&&d==2)
get(b3,3);
if(c==1&&d==0)
get(b4,4);
if(c==1&&d==1)
get(b5,5);
if(c==1&&d==2)
get(b6,6);
if(c==2&&d==0)
get(b7,7);
if(c==2&&d==1)
get(b8,8);
if(c==2&&d==2)
get(b9,9);
break;
}  
}
}

int get(char a[][],char ch)
{
/*It will place the character in the empty position and then call position function
  to check whether it is winnable*/
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
if(a[i][j]=='.')
{
a[i][j]=ch;
char pa=position(a);
if(pa==ch)
{
a[i][j]=ch;
providebutton(i,j,""+ch);
return 1; 
}
else
a[i][j]='.';
}
}
}
return 0;
}

char position(char a[][])//It will return the character which has 3 characters in the same line else return ' '
{
char ch=' ';
if(a[0][0]==a[0][1]&&a[0][0]==a[0][2]&&a[0][0]!='.')
ch=a[0][0];
 if(a[0][0]==a[1][1]&&a[0][0]==a[2][2]&&a[0][0]!='.')
ch=a[0][0];
 if(a[0][0]==a[1][0]&&a[0][0]==a[2][0]&&a[0][0]!='.')
ch=a[0][0];
 if(a[0][1]==a[1][1]&&a[0][1]==a[2][1]&&a[0][1]!='.')
ch=a[0][1];
 if(a[0][2]==a[1][2]&&a[0][2]==a[2][2]&&a[0][2]!='.')
ch=a[0][2];
 if(a[1][0]==a[1][1]&&a[1][0]==a[1][2]&&a[1][0]!='.')
ch=a[1][0];
 if(a[2][0]==a[2][1]&&a[2][0]==a[2][2]&&a[2][0]!='.')
ch=a[2][0];
 if(a[0][2]==a[1][1]&&a[0][2]==a[2][0]&&a[0][2]!='.')
ch=a[2][0];
 return ch;
}

int fill(char a[][],char ch)
{
/*It will tell whether any two positions are empty and these two positions will help to make a straight line
 So make a move in any one of the positions 
 If not the case then move in any position which is empty*/
int i,j,k,e=0,f=0,g=0,h=0;
for(i=0;i<3;i++)
{
int a1=0,b=0,c=0,d=0;
for(j=0;j<3;j++)
{
if(a[i][j]=='.')
a1++;//For counting horizontal lines that contains two empty spaces
if(a[i][j]==ch)
b++;
if(a[j][i]=='.')
c++;//For counting vertical lines that contains two empty spaces
if(a[j][i]==ch)
d++;
if(i==j)
{
if(a[i][j]=='.')
e++;
if(a[i][j]==ch)
f++;//For main diagonal
}
if((i+j)==2)
{
if(a[i][j]=='.')
g++;
if(a[i][j]==ch)
h++;//For secondary diagonal
}
}
if(a1==2 && b==1)//If two empty spaces and one character present in a horizontal line then put that character in that empty space
{
for(k=0;k<3;k++)
{
if(a[i][k]=='.')
{
a[i][k]=ch;
providebutton(i,k,""+ch);
return 1;
}
}
}
if(c==2 && d==1)//Simlarly for vertical lines
{
for(k=0;k<3;k++)
{
if(a[k][i]=='.')
{
a[k][i]=ch;
providebutton(k,i,""+ch);
return 1;
}
}
}
}
if(e==2 && f==1)//For main diagonal
{
if(a[0][0]=='.')
{
a[0][0]=ch;
providebutton(0,0,""+ch);
}
else if(a[1][1]=='.')
{
a[1][1]=ch;
providebutton(1,1,""+ch);
}
else if(a[2][2]=='.')
{
a[2][2]=ch;
providebutton(2,2,""+ch);
}
return 1;
}
if(g==2 && h==1)//For secondary diagonal
{
if(a[0][2]=='.')
{
a[0][2]=ch;
providebutton(0,2,""+ch);
}
else if(a[1][1]=='.')
{
a[1][1]=ch;
providebutton(1,1,""+ch);
}
else if(a[2][0]=='.')
{
a[2][0]=ch;
providebutton(2,0,""+ch);
}
return 1;
}

for(i=0;i<3;i++)//If none present then fill an empty space
{
for(j=0;j<3;j++)
{
if(a[i][j]=='.')
{
a[i][j]=ch;
providebutton(i,j,""+ch);
return 1;
}
}
}
return 0;
}

int counter(char a[][],char ch1,char ch2)
{
 for(int i=0;i<3;i++)
{
   for(int j=0;j<3;j++)
{
if(a[i][j]=='.')
{
a[i][j]=ch1;
char pa=position(a);
if(pa==ch1)
{
a[i][j]=ch2;
providebutton(i,j,""+ch2);
return 1;
}
else
a[i][j]='.';
}
}
}
return 0;
}

int verdict(char a[][],char ch1)//Gives the verdict LOSS/WIN
{
char ch=position(a);
String b[]={"RESTART","CLOSE"};
String r="";
if(ch==ch1)
{
time_load.stop();
if(c!=2)
{
loss1++;
loss.setText("LOSSES:"+loss1);
r="YOU LOSE";
}
else
r=s1.getText()+" WIN";
c=JOptionPane.showOptionDialog(null, r+"\nWant to play again?", "RESULT",
JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
null, b,b[0]);
c=c+1;
return c;
}

else if(ch!=' ')
{
time_load.stop();
if(c!=2)
{
win1++;
win.setText("WINS:"+win1);
r="YOU WIN";
}
else
r=s2.getText()+" WIN";
c= JOptionPane.showOptionDialog(null, r+"\nWant to play again?", "RESULT",
JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
null, b,b[0]);
c=c+1;
return c;
}

return 0;
}

int check2(char a[][],int n)//If valid position
{
if(a[(n/10)-1][(n%10)-1]=='.')
return n;
return 0;
}

int providen(int loc)
{
int n=0;
if(loc==1)
n=11;
if(loc==2)
n=12;
if(loc==3)
n=13;
if(loc==4)
n=21;
if(loc==5)
n=22;
if(loc==6)
n=23;
if(loc==7)
n=31;
if(loc==8)
n=32;
if(loc==9)
n=33;
return n;
}

public void providebutton(int a,int b,String ch)
{
if(a==0&&b==0)
{
b1.setText(ch);
un2=11;
}
if(a==0&&b==1)
{
b2.setText(ch);
un2=12;
}
if(a==0&&b==2)
{
b3.setText(ch);
un2=13;
}
if(a==1&&b==0)
{
b4.setText(ch);
un2=21;
}
if(a==1&&b==1)
{
b5.setText(ch);
un2=22;
}
if(a==1&&b==2)
{
b6.setText(ch);
un2=23;
}
if(a==2&&b==0)
{
b7.setText(ch);
un2=31;
}
if(a==2&&b==1)
{
b8.setText(ch);
un2=32;
}
if(a==2&&b==2)
{
b9.setText(ch);
un2=33;
}
}

public void reset(int c)//For undo move
{
if(c==11)
{
b1.setText("");
a[0][0]='.';
}
if(c==12)
{
b2.setText("");
a[0][1]='.';
}
if(c==13)
{
b3.setText("");
a[0][2]='.';
}
if(c==21)
{
b4.setText("");
a[1][0]='.';
}
if(c==22)
{
b5.setText("");
a[1][1]='.';
}
if(c==23)
{
b6.setText("");
a[1][2]='.';
}
if(c==31)
{
b7.setText("");
a[2][0]='.';
}
if(c==32)
{
b8.setText("");
a[2][1]='.';
}
if(c==33)
{
b9.setText("");
a[2][2]='.';
}
}

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        get(b1,1);
        if(tim==1)
        {
        seconds=3;
        sec.setText("03");
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
             get(b2,2);
             if(tim==1)
        {
        seconds=3;
        sec.setText("03");
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
           get(b3,3);
           if(tim==1)
        {
        seconds=3;
        sec.setText("03");
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
              get(b4,4);
              if(tim==1)
        {
        seconds=3;
        sec.setText("03");
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
              get(b5,5);
              if(tim==1)
        {
        seconds=3;
        sec.setText("03");
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
             get(b6,6);
             if(tim==1)
        {
        seconds=3;
 sec.setText("03");
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
            get(b7,7);
            if(tim==1)
        {
        seconds=3;
        sec.setText("03");
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
              get(b8,8);
              if(tim==1)
        {
        seconds=3;
        sec.setText("03");
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
          get(b9,9);
          if(tim==1)
        {
       seconds=3;
       sec.setText("03");
        }
    }//GEN-LAST:event_b9ActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        restart();
    }//GEN-LAST:event_restartActionPerformed

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
    if(x!=1||c!=1)
    {
    if(un1>0&&un2>0)
    {
      reset(un1);
      reset(un2);
      un1=-1;
      un2=-1;
      x=x-2;
    }
    else if(un1==0&&un2==0)
    JOptionPane.showMessageDialog(null,"Make a move");
   else if(un1==-1&&un2==-1&&x!=0)
      JOptionPane.showMessageDialog(null,"Undo Move Can Be Done One Time");
    else if(un1==-1&&un2==-1&&x==0)
        JOptionPane.showMessageDialog(null,"Make a move");
    }
    else if(x==1&&c==1)
       JOptionPane.showMessageDialog(null,"Make A Move"); 
    }//GEN-LAST:event_undoActionPerformed

    
    
    private void start_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_buttonActionPerformed
        start.hide();
        normal.show();
    }//GEN-LAST:event_start_buttonActionPerformed

    private void easyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyActionPerformed
       m=0;
       mode.hide();
       call();
    }//GEN-LAST:event_easyActionPerformed

    private void hardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardActionPerformed
       m=1;
       mode.hide();
       call();
    }//GEN-LAST:event_hardActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       stat.hide();
       mode.show();
    }//GEN-LAST:event_backActionPerformed

    private void stat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stat1ActionPerformed
        mode.hide();
        stat.show();
    }//GEN-LAST:event_stat1ActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        player.hide();
        mode.show();
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
    player.hide();
    undo.setEnabled(false);
    names.show();
    playername.setVisible(true);
    turn.setVisible(true);
    c=2;
    }//GEN-LAST:event_twoActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
       mode.hide();
       player.show();
    }//GEN-LAST:event_back1ActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
  
        if(s1.getText().isEmpty()&&s2.getText().isEmpty())
      JOptionPane.showMessageDialog(null,"Enter the names of both the players");
      else if(s1.getText().isEmpty())
      JOptionPane.showMessageDialog(null,"Enter the name of Player 1");  
      else if(s2.getText().isEmpty())
      JOptionPane.showMessageDialog(null,"Enter the name of Player 2"); 
        else
      {
          restart();
          names.hide();
          game.show();
      }
    }//GEN-LAST:event_okActionPerformed

    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
       s1.setText(null);
       s2.setText(null);
       names.hide();
       player.show();
    }//GEN-LAST:event_back2ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
 
    }//GEN-LAST:event_s1ActionPerformed

    private void s1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1KeyPressed

    private void normActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normActionPerformed
        normal.hide();
        player.show();
        undo.setEnabled(true);
        tim=0;
    }//GEN-LAST:event_normActionPerformed

    private void timerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerActionPerformed
        normal.hide();
        player.show();
        undo.setEnabled(false);
        tim=1;
    }//GEN-LAST:event_timerActionPerformed

    private void back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back3ActionPerformed
        player.hide();
        normal.show();
    }//GEN-LAST:event_back3ActionPerformed

    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton back;
    private javax.swing.JButton back1;
    private javax.swing.JButton back2;
    private javax.swing.JButton back3;
    private javax.swing.JLabel colon;
    private javax.swing.JTextField draw;
    private javax.swing.JButton easy;
    private javax.swing.JPanel game;
    private javax.swing.JButton hard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField loss;
    private javax.swing.JLabel min;
    private javax.swing.JPanel mode;
    private javax.swing.JTextField name;
    private javax.swing.JPanel names;
    private javax.swing.JButton norm;
    private javax.swing.JPanel normal;
    private javax.swing.JButton ok;
    private javax.swing.JButton one;
    private javax.swing.JPanel player;
    private javax.swing.JTextField player1;
    private javax.swing.JTextField player2;
    private javax.swing.JTextField playername;
    private javax.swing.JProgressBar progress;
    private javax.swing.JButton restart;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JLabel sec;
    private javax.swing.JPanel start;
    private javax.swing.JButton start_button;
    private javax.swing.JPanel stat;
    private javax.swing.JButton stat1;
    private javax.swing.JButton timer;
    private javax.swing.JTextField turn;
    private javax.swing.JButton two;
    private javax.swing.JButton undo;
    private javax.swing.JTextField win;
    // End of variables declaration//GEN-END:variables

}
