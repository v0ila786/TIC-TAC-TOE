import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

class welcome extends javax.swing.JFrame {
   // private Clip backgroundMusic;
    public welcome() {
        initComponents();
        playBackgroundMusic();
    }
    @SuppressWarnings("unchecked")
    //"Generated Code">

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1070, 600));
        setPreferredSize(new java.awt.Dimension(1070, 600));
        setResizable(false);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);

        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jButton1.setText("Lets Play");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 102), 5, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 390, 250, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("welcome.png"))); // NOI18N
        jLabel1.setText("m");
        jLabel1.setPreferredSize(new java.awt.Dimension(1070, 600));
        jLabel1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 1060, 600);

        pack();
    }
    //for backgroundmusic
    private void playBackgroundMusic() {
        try {
            // Load the music file using the class loader's getResource method
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("music.wav"));
            Clip backgroundMusic = AudioSystem.getClip();
            backgroundMusic.open(audioInputStream);

            // Start playing the music on a loop in a separate thread
            Thread musicThread = new Thread(() -> {
                backgroundMusic.loop(Clip.LOOP_CONTINUOUSLY);
            });
            musicThread.start();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        playButtonClickSound();
        g1 g1screen = new g1();
        g1screen.setVisible(true);
        this.setVisible(false);

    }
    //for button music
    public void playButtonClickSound() {
        try {
            // Load the button click sound file using the class loader's getResource method
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("button.wav"));
            Clip buttonClickSound = AudioSystem.getClip();
            buttonClickSound.open(audioInputStream);
            buttonClickSound.start(); // Play the sound
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration
}

class g1 extends javax.swing.JFrame {

    private String startGame = "X";
    public g1() {
        initComponents();
        setSize(1070,630);
        setResizable(false);
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // "Generated Code">
    private void initComponents() {

        tic1 = new javax.swing.JButton();
        tic2 = new javax.swing.JButton();
        tic3 = new javax.swing.JButton();
        tic4 = new javax.swing.JButton();
        tic5 = new javax.swing.JButton();
        tic6 = new javax.swing.JButton();
        tic7 = new javax.swing.JButton();
        tic8 = new javax.swing.JButton();
        tic9 = new javax.swing.JButton();
        resetbuttton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1070, 602));
        getContentPane().setLayout(null);

        tic1.setBackground(new java.awt.Color(102, 0, 204));
        tic1.setFont(new java.awt.Font("Segoe UI Black", 1, 55)); // NOI18N
        tic1.setForeground(new java.awt.Color(255, 255, 255));
        tic1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 10
                , true));
        tic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic1ActionPerformed(evt);
            }
        });
        getContentPane().add(tic1);
        tic1.setBounds(320, 90, 150, 150);

        tic2.setBackground(new java.awt.Color(102, 0, 204));
        tic2.setFont(new java.awt.Font("Segoe UI Black", 1, 55)); // NOI18N
        tic2.setForeground(new java.awt.Color(255, 255, 255));
        tic2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 10, true));
        tic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic2ActionPerformed(evt);
            }
        });
        getContentPane().add(tic2);
        tic2.setBounds(470, 90, 150, 150);

        tic3.setBackground(new java.awt.Color(102, 0, 204));
        tic3.setFont(new java.awt.Font("Segoe UI Black", 1, 55)); // NOI18N
        tic3.setForeground(new java.awt.Color(255, 255, 255));
        tic3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 10, true));
        tic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic3ActionPerformed(evt);
            }
        });
        getContentPane().add(tic3);
        tic3.setBounds(620, 90, 150, 150);

        tic4.setBackground(new java.awt.Color(102, 0, 204));
        tic4.setFont(new java.awt.Font("Segoe UI Black", 1, 55)); // NOI18N
        tic4.setForeground(new java.awt.Color(255, 255, 255));
        tic4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 14, true));
        tic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic4ActionPerformed(evt);
            }
        });
        getContentPane().add(tic4);
        tic4.setBounds(320, 240, 150, 150);

        tic5.setBackground(new java.awt.Color(102, 0, 204));
        tic5.setFont(new java.awt.Font("Segoe UI Black", 1, 55)); // NOI18N
        tic5.setForeground(new java.awt.Color(255, 255, 255));
        tic5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 10, true));
        tic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic5ActionPerformed(evt);
            }
        });
        getContentPane().add(tic5);
        tic5.setBounds(470, 240, 150, 150);

        tic6.setBackground(new java.awt.Color(102, 0, 204));
        tic6.setFont(new java.awt.Font("Segoe UI Black", 1, 55)); // NOI18N
        tic6.setForeground(new java.awt.Color(255, 255, 255));
        tic6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 10, true));
        tic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic6ActionPerformed(evt);
            }
        });
        getContentPane().add(tic6);
        tic6.setBounds(620, 240, 150, 150);

        tic7.setBackground(new java.awt.Color(102, 0, 204));
        tic7.setFont(new java.awt.Font("Segoe UI Black", 1, 55)); // NOI18N
        tic7.setForeground(new java.awt.Color(255, 255, 255));
        tic7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 10, true));
        tic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic7ActionPerformed(evt);
            }
        });
        getContentPane().add(tic7);
        tic7.setBounds(320, 390, 150, 150);

        tic8.setBackground(new java.awt.Color(102, 0, 204));
        tic8.setFont(new java.awt.Font("Segoe UI Black", 1, 55)); // NOI18N
        tic8.setForeground(new java.awt.Color(255, 255, 255));
        tic8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 10, true));
        tic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic8ActionPerformed(evt);
            }
        });
        getContentPane().add(tic8);
        tic8.setBounds(470, 390, 150, 150);

        tic9.setBackground(new java.awt.Color(102, 0, 204));
        tic9.setFont(new java.awt.Font("Segoe UI Black", 1, 55)); // NOI18N
        tic9.setForeground(new java.awt.Color(255, 255, 255));
        tic9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 10, true));
        tic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tic9ActionPerformed(evt);
            }
        });
        getContentPane().add(tic9);
        tic9.setBounds(620, 390, 150, 150);

        resetbuttton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        resetbuttton.setText("RESET");
        resetbuttton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 102), 6, true));
        resetbuttton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbutttonActionPerformed(evt);
            }
        });
        getContentPane().add(resetbuttton);
        resetbuttton.setBounds(840, 70, 160, 40);

        exitbutton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        exitbutton.setText("EXIT");
        exitbutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 102), 5, true));
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(exitbutton);
        exitbutton.setBounds(840, 520, 160, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("GAME.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 6));
        jLabel2.setMaximumSize(new java.awt.Dimension(1070, 630));
        jLabel2.setMinimumSize(new java.awt.Dimension(1070, 630));
        jLabel2.setPreferredSize(new java.awt.Dimension(1070, 630));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 1070, 630);

        pack();
    }

    //changing from cross to 0
    private void choose_a_player(){


        if (startGame.equalsIgnoreCase("X")){
            startGame = "O";
        }
        else{
            startGame= "X";
        }


    }

   //winning game conditions
    private void winningGame(){
        String t1 = tic1.getText();
        String t2 = tic2.getText();
        String t3 = tic3.getText();
        String t4 = tic4.getText();
        String t5 = tic5.getText();
        String t6 = tic6.getText();
        String t7 = tic7.getText();
        String t8 = tic8.getText();
        String t9 = tic9.getText();

        //for first row
        if(t1=="X" && t2=="X" && t3=="X" || t1=="O" && t2=="O" && t3=="O"){

            if(t1=="X"){
                player1 p1 = new player1();
                p1.setVisible(true);
                setVisible(false);
            }
            else{
                player2 screen = new player2();
                screen.setVisible(true);
                this.setVisible(false);
            }

        }

        //for second row
        if(t4=="X" && t5=="X" && t6=="X" || t4=="O" && t5=="O" && t6=="O"){

            if(t4=="X"){
                player1 p1 = new player1();
                p1.setVisible(true);
                setVisible(false);
            }
            else{
                player2 screen = new player2();
                screen.setVisible(true);
                this.setVisible(false);
            }

        }
        //for third row
        if(t7=="X" && t8=="X" && t9=="X" || t7=="O" && t8=="O" && t9=="O"){

            if(t7=="X"){
                player1 p1 = new player1();
                p1.setVisible(true);
                setVisible(false);
            }
            else{
                player2 screen = new player2();
                screen.setVisible(true);
                this.setVisible(false);
            }

        }
        //for 1st column
        if(t1=="X" && t4=="X" && t7=="X" || t1=="O" && t4=="O" && t7=="O"){

            if(t1=="X"){
                player1 p1 = new player1();
                p1.setVisible(true);
                setVisible(false);
            }
            else{
                player2 screen = new player2();
                screen.setVisible(true);
                this.setVisible(false);
            }

        }
        //for 2nd column
        if(t2=="X" && t5=="X" && t8=="X" || t2=="O" && t5=="O" && t8=="O"){

            if(t2=="X"){
                player1 p1 = new player1();
                p1.setVisible(true);
                setVisible(false);
            }
            else{
                player2 screen = new player2();
                screen.setVisible(true);
                this.setVisible(false);
            }

        }
        //for 3rd column
        if(t3=="X" && t6=="X" && t9=="X" || t3=="O" && t6=="O" && t9=="O"){

            if(t2=="X"){
                player1 p1 = new player1();
                p1.setVisible(true);
                setVisible(false);
            }
            else{
                player2 screen = new player2();
                screen.setVisible(true);
                this.setVisible(false);
            }

        }

        //for primary diagonal
        if(t1=="X" && t5=="X" && t9=="X" || t1=="O" && t5=="O" && t9=="O"){

            if(t1=="X"){
                player1 p1 = new player1();
                p1.setVisible(true);
               this.setVisible(false);}
            else{
                player2 screen = new player2();
                screen.setVisible(true);
                this.setVisible(false);
            }

        }
        //for secondary diagonal
        if(t3=="X" && t5=="X" && t7=="X" || t3=="O" && t5=="O" && t7=="O"){

            if(t3=="X"){
                player1 p1 = new player1();
                p1.setVisible(true);
                this.setVisible(false);}
            else{
                player2 screen = new player2();
                screen.setVisible(true);
                this.setVisible(false);
            }

        }


    }
    //coding for putting cross and O in the buttons
    private void tic1ActionPerformed(java.awt.event.ActionEvent evt) {
        playButtonClickSoundtic();
        if(tic1.getText().isEmpty()){
        tic1.setText(startGame);
            choose_a_player();
        winningGame();


        }


    }




    private void tic2ActionPerformed(java.awt.event.ActionEvent evt) {
        playButtonClickSoundtic();
        if(tic2.getText().isEmpty()){
        tic2.setText(startGame);
            winningGame();
        choose_a_player();


        }


    }

    private void tic3ActionPerformed(java.awt.event.ActionEvent evt) {
        playButtonClickSoundtic();
        if(tic3.getText().isEmpty()){
            tic3.setText(startGame);
            choose_a_player();
            winningGame();

        }

    }

    private void tic4ActionPerformed(java.awt.event.ActionEvent evt) {
        playButtonClickSoundtic();
        if(tic4.getText().isEmpty()){
            tic4.setText(startGame);
            choose_a_player();
            winningGame();

        }

    }

    private void tic5ActionPerformed(java.awt.event.ActionEvent evt) {
        playButtonClickSoundtic();
        if(tic5.getText().isEmpty()){
            tic5.setText(startGame);
            choose_a_player();
            winningGame();

        }

    }

    private void tic6ActionPerformed(java.awt.event.ActionEvent evt) {
        playButtonClickSoundtic();
        if(tic6.getText().isEmpty()){
            tic6.setText(startGame);
            choose_a_player();
            winningGame();

        }

    }

    private void tic7ActionPerformed(java.awt.event.ActionEvent evt) {
        playButtonClickSoundtic();
        if(tic7.getText().isEmpty()){
            tic7.setText(startGame);
            choose_a_player();
            winningGame();

        }

    }

    private void tic8ActionPerformed(java.awt.event.ActionEvent evt) {
        playButtonClickSoundtic();
        if(tic8.getText().isEmpty()){
            tic8.setText(startGame);
            choose_a_player();
            winningGame();

        }

    }

    private void tic9ActionPerformed(java.awt.event.ActionEvent evt) {
        playButtonClickSoundtic();
        if(tic9.getText().isEmpty()){
            tic9.setText(startGame);
            choose_a_player();
            winningGame();

        }

    }
    private void playButtonClickSoundtic() {
        try {
            // Load the button click sound file using the class loader's getResource method
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("ticbutton.wav"));
            Clip buttonClickSound = AudioSystem.getClip();
            buttonClickSound.open(audioInputStream);
            buttonClickSound.start(); // Play the sound
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    //method for button music
    public void playButtonClickSound() {
        try {
            // Load the button click sound file using the class loader's getResource method
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("button.wav"));
            Clip buttonClickSound = AudioSystem.getClip();
            buttonClickSound.open(audioInputStream);
            buttonClickSound.start(); // Play the sound
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    private void resetbutttonActionPerformed(java.awt.event.ActionEvent evt) {
        playButtonClickSound();
        tic1.setEnabled(true);
        tic2.setEnabled(true);
        tic3.setEnabled(true);
        tic4.setEnabled(true);
        tic5.setEnabled(true);
        tic6.setEnabled(true);
        tic7.setEnabled(true);
        tic8.setEnabled(true);
        tic9.setEnabled(true);

        tic1.setText("");
        tic2.setText("");
        tic3.setText("");
        tic4.setText("");
        tic5.setText("");
        tic6.setText("");
        tic7.setText("");
        tic8.setText("");
        tic9.setText("");

    }
//exit button
    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {
        playButtonClickSound();
        System.exit(0);
    }

    // Variables declaration
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton resetbuttton;
    private javax.swing.JButton tic1;
    private javax.swing.JButton tic2;
    private javax.swing.JButton tic3;
    private javax.swing.JButton tic4;
    private javax.swing.JButton tic5;
    private javax.swing.JButton tic6;
    private javax.swing.JButton tic7;
    private javax.swing.JButton tic8;
    private javax.swing.JButton tic9;
    // End of variables declaration
}

class player1 extends javax.swing.JFrame {


    public player1() {
        playBackgroundMusicOnce();
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);

    }
    private void playBackgroundMusicOnce() {
        try {
            // Load the music file from a specific location (change the file path accordingly)
            File musicFile = new File("C:\\Users\\ADMIN\\Desktop\\gamet\\resources\\win.wav");
            if (musicFile.exists()) {
                Clip backgroundMusic = AudioSystem.getClip();
                backgroundMusic.open(AudioSystem.getAudioInputStream(musicFile));
                backgroundMusic.start();
            } else {
                System.err.println("Music file not found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // "Generated Code">
    private void initComponents() {

        playagainbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playagainbutton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        playagainbutton.setText("Play Again...!");
        playagainbutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 102), 5, true));
        playagainbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playagainbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(playagainbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("player1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 602));

        pack();
    }// </editor-fold>

    private void playagainbuttonActionPerformed(java.awt.event.ActionEvent evt) {
        playButtonClickSound();
        g1 screen = new g1();
        screen.setVisible(true);
        this.setVisible(false);
    }
    public void playButtonClickSound() {
        try {
            // Load the button click sound file using the class loader's getResource method
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("button.wav"));
            Clip buttonClickSound = AudioSystem.getClip();
            buttonClickSound.open(audioInputStream);
            buttonClickSound.start(); // Play the sound
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton playagainbutton;
    // End of variables declaration
}

class player2 extends javax.swing.JFrame {

    public player2() {
        initComponents();
        playBackgroundMusicOnce();
        setResizable(false);
        setLocationRelativeTo(null);
    }
    private void playBackgroundMusicOnce() {
        try {
            // Load the music file from a specific location (change the file path accordingly)
            File musicFile = new File("C:\\Users\\ADMIN\\Desktop\\gamet\\resources\\win.wav");
            if (musicFile.exists()) {
                Clip backgroundMusic = AudioSystem.getClip();
                backgroundMusic.open(AudioSystem.getAudioInputStream(musicFile));
                backgroundMusic.start();
            } else {
                System.err.println("Music file not found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // Generated Code">
    private void initComponents() {

        playagainbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playagainbutton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        playagainbutton.setText("Play Again...!");
        playagainbutton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 102), 5, true));
        playagainbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playagainbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(playagainbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 210, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("player2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        pack();
    }// </editor-fold>

    private void playagainbuttonActionPerformed(java.awt.event.ActionEvent evt) {
        playButtonClickSound();
        g1 g1sccreen = new g1();
        g1sccreen.setVisible(true);
        this.setVisible(false);

    }
    public void playButtonClickSound() {
        try {
            // Load the button click sound file using the class loader's getResource method
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("button.wav"));
            Clip buttonClickSound = AudioSystem.getClip();
            buttonClickSound.open(audioInputStream);
            buttonClickSound.start(); // Play the sound
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton playagainbutton;
    // End of variables declaration
}

public class Main {

    public static void main(String[] args) {

        welcome welcomepage = new welcome();
        welcomepage.setVisible(true);

    }
}