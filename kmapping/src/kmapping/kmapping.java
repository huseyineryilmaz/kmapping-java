package kmapping;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class kmapping extends JFrame {

    static String output = "";
    static String output3 = "";
    static String output2 = "";
    static int A[][] = new int[4][4];
    static int A3[][] = new int[2][4];
    static int A2[][] = new int[2][2];
    static int checked[][] = new int[4][4];
    static int checked3[][] = new int[2][4];
    static int checked2[][] = new int[2][2];
    static int value[] = new int[16];
    static int value3[] = new int[8];
    static int value2[] = new int[4];
    JButton btn[] = new JButton[16];
    JButton btn3[] = new JButton[8];
    JButton btn2[] = new JButton[4];
    JLabel lbl[] = new JLabel[16];
    JLabel lbl3[] = new JLabel[8];
    JLabel lbl2[] = new JLabel[4];
    JPanel table4, table3, table2;
    JLabel text, text3, text2, textMain;
    JButton calculate, allone, reset, calculate3, allone3, reset3, calculate2, allone2, reset2;

    public kmapping() {
        JFrame f = new JFrame();
        JFrame f1 = new JFrame();
        JFrame f2 = new JFrame();
        JFrame f3 = new JFrame();

        f.setTitle("Karnaugh Map");
        f.setSize(580, 430);
        f.setLocation(300, 50);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLayout(null);

        f1.setTitle("Karnaugh Map");
        f1.setSize(580, 430);
        f1.setLocation(300, 50);
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f1.setResizable(false);
        f1.setLayout(null);

        f2.setTitle("Karnaugh Map");
        f2.setSize(580, 430);
        f2.setLocation(300, 50);
        f2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f2.setResizable(false);
        f2.setLayout(null);

        f3.setTitle("Karnaugh Map");
        f3.setSize(580, 430);
        f3.setLocation(300, 50);
        f3.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f3.setResizable(false);
        f3.setLayout(null);

        table4 = new JPanel();
        text = new JLabel();
        table4.setBounds(140, 30, 400, 300);
        table4.setBackground(Color.BLUE);

        table3 = new JPanel();
        text3 = new JLabel();
        table3.setBounds(140, 30, 400, 300);
        table3.setBackground(Color.BLUE);

        table2 = new JPanel();
        text2 = new JLabel();
        table2.setBounds(230, 85, 200, 200);
        table2.setBackground(Color.BLUE);

        text.setBounds(0, 330, 580, 100);
        text.setBackground(Color.white);

        text3.setBounds(0, 330, 580, 100);
        text3.setBackground(Color.white);

        text2.setBounds(0, 330, 580, 100);
        text2.setBackground(Color.white);

        table4.setLayout(new GridLayout(4, 4));

        textMain = new JLabel();
        textMain.setBounds(0, 25, 580, 100);
        textMain.setBackground(Color.white);
        textMain.setText("Select Number of Variables:");
        f1.add(textMain);

        for (int i = 0; i < 16; i++) {
            btn[i] = new JButton();
            btn[i].setIcon(new ImageIcon("0.png"));
            table4.add(btn[i]);
            table4.validate();
            value[i] = 0;
        }

        table3.setLayout(new GridLayout(2, 4));

        for (int i = 0; i < 8; i++) {
            btn3[i] = new JButton();
            btn3[i].setIcon(new ImageIcon("0.png"));
            table3.add(btn3[i]);
            table3.validate();
            value3[i] = 0;
        }

        table2.setLayout(new GridLayout(2, 2));

        for (int i = 0; i < 4; i++) {
            btn2[i] = new JButton();
            btn2[i].setIcon(new ImageIcon("0.png"));
            table2.add(btn2[i]);
            table2.validate();
            value2[i] = 0;
        }

        lbl[0] = new JLabel("A'B'");
        lbl[0].setBounds(110, 30, 30, 75);
        f.add(lbl[0]);
        lbl[1] = new JLabel("A'B");
        lbl[1].setBounds(110, 105, 30, 75);
        f.add(lbl[1]);
        lbl[2] = new JLabel("AB");
        lbl[2].setBounds(110, 180, 30, 75);
        f.add(lbl[2]);
        lbl[3] = new JLabel("AB'");
        lbl[3].setBounds(110, 255, 30, 75);
        f.add(lbl[3]);
        lbl[4] = new JLabel("C'D'");
        lbl[4].setBounds(160, 0, 80, 30);
        f.add(lbl[4]);
        lbl[5] = new JLabel("C'D");
        lbl[5].setBounds(260, 0, 80, 30);
        f.add(lbl[5]);
        lbl[6] = new JLabel("CD");
        lbl[6].setBounds(360, 0, 80, 30);
        f.add(lbl[6]);
        lbl[7] = new JLabel("CD'");
        lbl[7].setBounds(460, 0, 80, 30);
        f.add(lbl[7]);

        lbl3[0] = new JLabel("A'");
        lbl3[0].setBounds(110, 60, 30, 75);
        f2.add(lbl3[0]);
        lbl3[1] = new JLabel("A");
        lbl3[1].setBounds(110, 215, 30, 75);
        f2.add(lbl3[1]);
        lbl3[2] = new JLabel("B'C'");
        lbl3[2].setBounds(160, 0, 80, 30);
        f2.add(lbl3[2]);
        lbl3[3] = new JLabel("B'C");
        lbl3[3].setBounds(260, 0, 80, 30);
        f2.add(lbl3[3]);
        lbl3[4] = new JLabel("BC");
        lbl3[4].setBounds(360, 0, 80, 30);
        f2.add(lbl3[4]);
        lbl3[5] = new JLabel("BC'");
        lbl3[5].setBounds(460, 0, 80, 30);
        f2.add(lbl3[5]);

        lbl2[0] = new JLabel("A'");
        lbl2[0].setBounds(200, 95, 30, 75);
        f3.add(lbl2[0]);
        lbl2[1] = new JLabel("A");
        lbl2[1].setBounds(200, 200, 30, 75);
        f3.add(lbl2[1]);
        lbl2[2] = new JLabel("B'");
        lbl2[2].setBounds(270, 60, 80, 30);
        f3.add(lbl2[2]);
        lbl2[3] = new JLabel("B");
        lbl2[3].setBounds(380, 60, 80, 30);
        f3.add(lbl2[3]);

        calculate = new JButton("Calculate");
        calculate.setBounds(5, 100, 90, 40);
        f.add(calculate);

        calculate3 = new JButton("Calculate");
        calculate3.setBounds(5, 100, 90, 40);
        f2.add(calculate3);

        calculate2 = new JButton("Calculate");
        calculate2.setBounds(5, 100, 90, 40);
        f3.add(calculate2);

        JButton fourtable = new JButton("4");
        fourtable.setBounds(195, 60, 90, 40);
        f1.add(fourtable);

        JButton threetable = new JButton("3");
        threetable.setBounds(300, 60, 90, 40);
        f1.add(threetable);

        JButton twotable = new JButton("2");
        twotable.setBounds(405, 60, 90, 40);
        f1.add(twotable);

        allone = new JButton("All One");
        allone.setBounds(5, 160, 90, 40);
        reset = new JButton("Reset");
        reset.setBounds(5, 220, 90, 40);
        f.add(allone);
        f.add(reset);
        f.add(table4);
        calculate.setVisible(true);
        allone.setVisible(true);
        reset.setVisible(true);
        f.add(text);
        f.setVisible(false);

        allone3 = new JButton("All One");
        allone3.setBounds(5, 160, 90, 40);
        reset3 = new JButton("Reset");
        reset3.setBounds(5, 220, 90, 40);
        f2.add(allone3);
        f2.add(reset3);
        f2.add(table3);
        calculate3.setVisible(true);
        allone3.setVisible(true);
        reset3.setVisible(true);
        f2.add(text3);
        f2.setVisible(false);

        allone2 = new JButton("All One");
        allone2.setBounds(5, 160, 90, 40);
        reset2 = new JButton("Reset");
        reset2.setBounds(5, 220, 90, 40);
        f3.add(allone2);
        f3.add(reset2);
        f3.add(table2);
        calculate2.setVisible(true);
        allone2.setVisible(true);
        reset2.setVisible(true);
        f3.add(text2);
        f3.setVisible(false);

        f1.setVisible(true);

        fourtable.addActionListener(e -> {
            f.setVisible(true);
            f1.setVisible(false);
        });

        threetable.addActionListener(e -> {
            f2.setVisible(true);
            f1.setVisible(false);
        });

        twotable.addActionListener(e -> {
            f3.setVisible(true);
            f1.setVisible(false);
        });

        btn[0].addActionListener((ActionEvent e) -> {
            value[0]++;
            value[0] %= 3;

            if (value[0] == 0) {
                btn[0].setIcon(new ImageIcon("0.png"));
            }
            if (value[0] == 1) {
                btn[0].setIcon(new ImageIcon("1.png"));
            }
            if (value[0] == 2) {
                btn[0].setIcon(new ImageIcon("x.png"));
            }
        });

        btn[1].addActionListener((ActionEvent e) -> {
            value[1]++;
            value[1] %= 3;

            if (value[1] == 0) {
                btn[1].setIcon(new ImageIcon("0.png"));
            }
            if (value[1] == 1) {
                btn[1].setIcon(new ImageIcon("1.png"));
            }
            if (value[1] == 2) {
                btn[1].setIcon(new ImageIcon("x.png"));
            }
        });
        btn[2].addActionListener((ActionEvent e) -> {
            value[2]++;
            value[2] %= 3;
            if (value[2] == 0) {
                btn[2].setIcon(new ImageIcon("0.png"));
            }
            if (value[2] == 1) {
                btn[2].setIcon(new ImageIcon("1.png"));
            }
            if (value[2] == 2) {
                btn[2].setIcon(new ImageIcon("x.png"));
            }
        });
        btn[3].addActionListener((ActionEvent e) -> {
            value[3]++;
            value[3] %= 3;
            if (value[3] == 0) {
                btn[3].setIcon(new ImageIcon("0.png"));
            }
            if (value[3] == 1) {
                btn[3].setIcon(new ImageIcon("1.png"));
            }
            if (value[3] == 2) {
                btn[3].setIcon(new ImageIcon("x.png"));
            }
        });
        btn[4].addActionListener((ActionEvent e) -> {
            value[4]++;
            value[4] %= 3;
            if (value[4] == 0) {
                btn[4].setIcon(new ImageIcon("0.png"));
            }
            if (value[4] == 1) {
                btn[4].setIcon(new ImageIcon("1.png"));
            }
            if (value[4] == 2) {
                btn[4].setIcon(new ImageIcon("x.png"));
            }
        });
        btn[5].addActionListener((ActionEvent e) -> {
            value[5]++;
            value[5] %= 3;
            if (value[5] == 0) {
                btn[5].setIcon(new ImageIcon("0.png"));
            }
            if (value[5] == 1) {
                btn[5].setIcon(new ImageIcon("1.png"));
            }
            if (value[5] == 2) {
                btn[5].setIcon(new ImageIcon("x.png"));
            }
        });
        btn[6].addActionListener((ActionEvent e) -> {
            value[6]++;
            value[6] %= 3;
            if (value[6] == 0) {
                btn[6].setIcon(new ImageIcon("0.png"));
            }
            if (value[6] == 1) {
                btn[6].setIcon(new ImageIcon("1.png"));
            }
            if (value[6] == 2) {
                btn[6].setIcon(new ImageIcon("x.png"));
            }
        });
        btn[7].addActionListener((ActionEvent e) -> {
            value[7]++;
            value[7] %= 3;
            if (value[7] == 0) {
                btn[7].setIcon(new ImageIcon("0.png"));
            }
            if (value[7] == 1) {
                btn[7].setIcon(new ImageIcon("1.png"));
            }
            if (value[7] == 2) {
                btn[7].setIcon(new ImageIcon("x.png"));
            }
        });
        btn[8].addActionListener((ActionEvent e) -> {
            value[8]++;
            value[8] %= 3;
            if (value[8] == 0) {
                btn[8].setIcon(new ImageIcon("0.png"));
            }
            if (value[8] == 1) {
                btn[8].setIcon(new ImageIcon("1.png"));
            }
            if (value[8] == 2) {
                btn[8].setIcon(new ImageIcon("x.png"));
            }
        });
        btn[9].addActionListener((ActionEvent e) -> {
            value[9]++;
            value[9] %= 3;
            if (value[9] == 0) {
                btn[9].setIcon(new ImageIcon("0.png"));
            }
            if (value[9] == 1) {
                btn[9].setIcon(new ImageIcon("1.png"));
            }
            if (value[9] == 2) {
                btn[9].setIcon(new ImageIcon("x.png"));
            }
        });
        btn[10].addActionListener((ActionEvent e) -> {
            value[10]++;
            value[10] %= 3;
            if (value[10] == 0) {
                btn[10].setIcon(new ImageIcon("0.png"));
            }
            if (value[10] == 1) {
                btn[10].setIcon(new ImageIcon("1.png"));
            }
            if (value[10] == 2) {
                btn[10].setIcon(new ImageIcon("x.png"));
            }
        });
        btn[11].addActionListener((ActionEvent e) -> {
            value[11]++;
            value[11] %= 3;
            if (value[11] == 0) {
                btn[11].setIcon(new ImageIcon("0.png"));
            }
            if (value[11] == 1) {
                btn[11].setIcon(new ImageIcon("1.png"));
            }
            if (value[11] == 2) {
                btn[11].setIcon(new ImageIcon("x.png"));
            }
        });
        btn[12].addActionListener((ActionEvent e) -> {
            value[12]++;
            value[12] %= 3;
            if (value[12] == 0) {
                btn[12].setIcon(new ImageIcon("0.png"));
            }
            if (value[12] == 1) {
                btn[12].setIcon(new ImageIcon("1.png"));
            }
            if (value[12] == 2) {
                btn[12].setIcon(new ImageIcon("x.png"));
            }
        });
        btn[13].addActionListener((ActionEvent e) -> {
            value[13]++;
            value[13] %= 3;
            if (value[13] == 0) {
                btn[13].setIcon(new ImageIcon("0.png"));
            }
            if (value[13] == 1) {
                btn[13].setIcon(new ImageIcon("1.png"));
            }
            if (value[13] == 2) {
                btn[13].setIcon(new ImageIcon("x.png"));
            }
        });
        btn[14].addActionListener((ActionEvent e) -> {
            value[14]++;
            value[14] %= 3;
            if (value[14] == 0) {
                btn[14].setIcon(new ImageIcon("0.png"));
            }
            if (value[14] == 1) {
                btn[14].setIcon(new ImageIcon("1.png"));
            }
            if (value[14] == 2) {
                btn[14].setIcon(new ImageIcon("x.png"));
            }
        });
        btn[15].addActionListener((ActionEvent e) -> {
            value[15]++;
            value[15] %= 3;
            if (value[15] == 0) {
                btn[15].setIcon(new ImageIcon("0.png"));
            }
            if (value[15] == 1) {
                btn[15].setIcon(new ImageIcon("1.png"));
            }
            if (value[15] == 2) {
                btn[15].setIcon(new ImageIcon("x.png"));
            }
        });

        btn3[0].addActionListener((ActionEvent e) -> {
            value3[0]++;
            value3[0] %= 3;

            if (value3[0] == 0) {
                btn3[0].setIcon(new ImageIcon("0.png"));
            }
            if (value3[0] == 1) {
                btn3[0].setIcon(new ImageIcon("1.png"));
            }
            if (value3[0] == 2) {
                btn3[0].setIcon(new ImageIcon("x.png"));
            }
        });

        btn3[1].addActionListener((ActionEvent e) -> {
            value3[1]++;
            value3[1] %= 3;
            if (value3[1] == 0) {
                btn3[1].setIcon(new ImageIcon("0.png"));
            }
            if (value3[1] == 1) {
                btn3[1].setIcon(new ImageIcon("1.png"));
            }
            if (value3[1] == 2) {
                btn3[1].setIcon(new ImageIcon("x.png"));
            }
        });
        btn3[2].addActionListener((ActionEvent e) -> {
            value3[2]++;
            value3[2] %= 3;
            if (value3[2] == 0) {
                btn3[2].setIcon(new ImageIcon("0.png"));
            }
            if (value3[2] == 1) {
                btn3[2].setIcon(new ImageIcon("1.png"));
            }
            if (value3[2] == 2) {
                btn3[2].setIcon(new ImageIcon("x.png"));
            }
        });
        btn3[3].addActionListener((ActionEvent e) -> {
            value3[3]++;
            value3[3] %= 3;
            if (value3[3] == 0) {
                btn3[3].setIcon(new ImageIcon("0.png"));
            }
            if (value3[3] == 1) {
                btn3[3].setIcon(new ImageIcon("1.png"));
            }
            if (value3[3] == 2) {
                btn3[3].setIcon(new ImageIcon("x.png"));
            }
        });
        btn3[4].addActionListener((ActionEvent e) -> {
            value3[4]++;
            value3[4] %= 3;
            if (value3[4] == 0) {
                btn3[4].setIcon(new ImageIcon("0.png"));
            }
            if (value3[4] == 1) {
                btn3[4].setIcon(new ImageIcon("1.png"));
            }
            if (value3[4] == 2) {
                btn3[4].setIcon(new ImageIcon("x.png"));
            }
        });
        btn3[5].addActionListener((ActionEvent e) -> {
            value3[5]++;
            value3[5] %= 3;
            if (value3[5] == 0) {
                btn3[5].setIcon(new ImageIcon("0.png"));
            }
            if (value3[5] == 1) {
                btn3[5].setIcon(new ImageIcon("1.png"));
            }
            if (value3[5] == 2) {
                btn3[5].setIcon(new ImageIcon("x.png"));
            }
        });
        btn3[6].addActionListener((ActionEvent e) -> {
            value3[6]++;
            value3[6] %= 3;
            if (value3[6] == 0) {
                btn3[6].setIcon(new ImageIcon("0.png"));
            }
            if (value3[6] == 1) {
                btn3[6].setIcon(new ImageIcon("1.png"));
            }
            if (value3[6] == 2) {
                btn3[6].setIcon(new ImageIcon("x.png"));
            }
        });
        btn3[7].addActionListener((ActionEvent e) -> {
            value3[7]++;
            value3[7] %= 3;
            if (value3[7] == 0) {
                btn3[7].setIcon(new ImageIcon("0.png"));
            }
            if (value3[7] == 1) {
                btn3[7].setIcon(new ImageIcon("1.png"));
            }
            if (value3[7] == 2) {
                btn3[7].setIcon(new ImageIcon("x.png"));
            }
        });

        allone.addActionListener((ActionEvent e) -> {
            text.setText("");
            output = "";

            for (int i = 0; i < 16; i++) {
                btn[i].setIcon(new ImageIcon("1.png"));
                value[i] = 1;
            }
        });
        reset.addActionListener((ActionEvent e) -> {
            text.setText("");
            output = "";

            for (int i = 0; i < 16; i++) {
                btn[i].setIcon(new ImageIcon("0.png"));
                value[i] = 0;
            }
        });

        btn2[0].addActionListener((ActionEvent e) -> {
            value2[0]++;
            value2[0] %= 3;
            if (value2[0] == 0) {
                btn2[0].setIcon(new ImageIcon("0.png"));
            }
            if (value2[0] == 1) {
                btn2[0].setIcon(new ImageIcon("1.png"));
            }
            if (value2[0] == 2) {
                btn2[0].setIcon(new ImageIcon("x.png"));
            }
        });

        btn2[1].addActionListener((ActionEvent e) -> {
            value2[1]++;
            value2[1] %= 3;
            if (value2[1] == 0) {
                btn2[1].setIcon(new ImageIcon("0.png"));
            }
            if (value2[1] == 1) {
                btn2[1].setIcon(new ImageIcon("1.png"));
            }
            if (value2[1] == 2) {
                btn2[1].setIcon(new ImageIcon("x.png"));
            }
        });
        btn2[2].addActionListener((ActionEvent e) -> {
            value2[2]++;
            value2[2] %= 3;
            if (value2[2] == 0) {
                btn2[2].setIcon(new ImageIcon("0.png"));
            }
            if (value2[2] == 1) {
                btn2[2].setIcon(new ImageIcon("1.png"));
            }
            if (value2[2] == 2) {
                btn2[2].setIcon(new ImageIcon("x.png"));
            }
        });
        btn2[3].addActionListener((ActionEvent e) -> {
            value2[3]++;
            value2[3] %= 3;
            if (value2[3] == 0) {
                btn2[3].setIcon(new ImageIcon("0.png"));
            }
            if (value2[3] == 1) {
                btn2[3].setIcon(new ImageIcon("1.png"));
            }
            if (value2[3] == 2) {
                btn2[3].setIcon(new ImageIcon("x.png"));
            }
        });

        allone3.addActionListener((ActionEvent e) -> {
            text3.setText("");
            output3 = "";

            for (int i = 0; i < 8; i++) {
                btn3[i].setIcon(new ImageIcon("1.png"));
                value3[i] = 1;
            }
        });
        reset3.addActionListener((ActionEvent e) -> {
            text3.setText("");
            output3 = "";

            for (int i = 0; i < 8; i++) {
                btn3[i].setIcon(new ImageIcon("0.png"));
                value3[i] = 0;
            }
        });

        allone2.addActionListener((ActionEvent e) -> {
            text2.setText("");
            output2 = "";

            for (int i = 0; i < 4; i++) {
                btn2[i].setIcon(new ImageIcon("1.png"));
                value2[i] = 1;
            }
        });
        reset2.addActionListener((ActionEvent e) -> {
            text2.setText("");
            output2 = "";

            for (int i = 0; i < 4; i++) {
                btn2[i].setIcon(new ImageIcon("0.png"));
                value2[i] = 0;
            }
        });

        calculate.addActionListener((ActionEvent e) -> {
            compute();
            text.setText("");

            text.setText("SOP=" + output.substring(1));
        });

        calculate3.addActionListener((ActionEvent e) -> {
            compute3();
            text3.setText("");
            text3.setText("SOP=" + output3.substring(1));
        });

        calculate2.addActionListener((ActionEvent e) -> {
            compute2();
            text2.setText("");
            text2.setText("SOP=" + output2.substring(1));
        });

    }

    static void compute() {
        initialize();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (A[i][j] == 1 && checked[i][j] == 0) {
                    int pass8 = check8(i, j);
                    if (pass8 == 0) {
                        int pass4 = check4(i, j);
                        if (pass4 == 0) {
                            int pass2 = check2(i, j);
                            if (pass2 == 0) {
                                nogrouping(i, j);
                            }
                        }
                    }
                }
            }
        }
        checkfull();
    }

    static void compute3() {
        initialize3();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (A3[i][j] == 1 && checked3[i][j] == 0) {
                    int pass4 = check4for3(i, j);
                    if (pass4 == 0) {
                        int pass2 = check2for3(i, j);
                        if (pass2 == 0) {
                            nogrouping3(i, j);
                        }
                    }
                }
            }
        }
        checkfull3();
    }

    static void compute2() {
        initialize2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (A2[i][j] == 1 && checked2[i][j] == 0) {
                    int pass3 = check3for2(i, j);
                    if (pass3 == 0) {
                        int pass2 = check2for2(i, j);
                        if (pass2 == 0) {
                            nogrouping2(i, j);
                        }
                    }
                }
            }
        }
        checkfull2();
    }

    static String checkfull() {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (A[i][j] != 0) {
                    count++;
                }
            }
        }
        if (count == 16) {
            return output = " 1";
        } else if (count == 0) {
            return output = " 0";
        }
        return output;
    }

    static String checkfull3() {
        int count = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (A3[i][j] != 0) {
                    count++;
                }
            }
        }
        if (count == 8) {
            return output3 = " 1";
        } else if (count == 0) {
            return output3 = " 0";
        }
        return output3;
    }

    static String checkfull2() {
        int count = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (A2[i][j] != 0) {
                    count++;
                }
            }
        }
        if (count == 4) {
            return output2 = " 1";
        } else if (count == 0) {
            return output2 = " 0";
        }
        return output2;

    }

    static int check8(int r, int c) {
        int result = 0;
        if (A[r][0] == 1 && A[r][1] == 1 && A[r][2] == 1 && A[r][3] == 1 && A[(r + 1) % 4][0] == 1 && A[(r + 1) % 4][1] == 1 && A[(r + 1) % 4][2] == 1 && A[(r + 1) % 4][3] == 1) {
            String local = "";
            if (r == 0) {
                local = "A'";
            }
            if (r == 1) {
                local = "B";
            }
            if (r == 2) {
                local = "A";
            }
            if (r == 3) {
                local = "B'";
            }
            output = output + "+" + local;
            result = 1;
            checked[r][0] = 1;
            checked[r][1] = 1;
            checked[r][2] = 1;
            checked[r][3] = 1;
            checked[(r + 1) % 4][0] = 1;
            checked[(r + 1) % 4][1] = 1;
            checked[(r + 1) % 4][2] = 1;
            checked[(r + 1) % 4][3] = 1;
        } else if (A[r][0] == 1 && A[r][1] == 1 && A[r][2] == 1 && A[r][3] == 1 && A[(4 + (r - 1)) % 4][0] == 1 && A[(4 + (r - 1)) % 4][1] == 1 && A[(4 + (r - 1)) % 4][2] == 1 && A[(4 + (r - 1)) % 4][3] == 1) {
            String local = "";
            if (r == 0) {
                local = "B'";
            }
            if (r == 1) {
                local = "A'";
            }
            if (r == 2) {
                local = "B";
            }
            if (r == 3) {
                local = "A";
            }
            output = output + "+" + local;
            result = 1;
            checked[r][0] = 1;
            checked[r][1] = 1;
            checked[r][2] = 1;
            checked[r][3] = 1;
            checked[(4 + (r - 1)) % 4][0] = 1;
            checked[(4 + (r - 1)) % 4][1] = 1;
            checked[(4 + (r - 1)) % 4][2] = 1;
            checked[(4 + (r - 1)) % 4][3] = 1;
        } else if (A[0][c] == 1 && A[1][c] == 1 && A[2][c] == 1 && A[3][c] == 1 && A[0][(c + 1) % 4] == 1 && A[1][(c + 1) % 4] == 1 && A[2][(c + 1) % 4] == 1 && A[3][(c + 1) % 4] == 1) {
            String local = "";
            if (c == 0) {
                local = "C'";
            }
            if (c == 1) {
                local = "D";
            }
            if (c == 2) {
                local = "C";
            }
            if (c == 3) {
                local = "D'";
            }
            output = output + "+" + local;
            result = 1;
            checked[0][c] = 1;
            checked[1][c] = 1;
            checked[2][c] = 1;
            checked[3][c] = 1;
            checked[0][(c + 1) % 4] = 1;
            checked[1][(c + 1) % 4] = 1;
            checked[2][(c + 1) % 4] = 1;
            checked[3][(c + 1) % 4] = 1;
        } else if (A[0][c] == 1 && A[1][c] == 1 && A[2][c] == 1 && A[3][c] == 1 && A[0][(4 + (c - 1)) % 4] == 1 && A[1][(4 + (c - 1)) % 4] == 1 && A[2][(4 + (c - 1)) % 4] == 1 && A[3][(4 + (c - 1)) % 4] == 1) {
            String local = "";
            if (c == 0) {
                local = "D'";
            }
            if (c == 1) {
                local = "C'";
            }
            if (c == 2) {
                local = "D";
            }
            if (c == 3) {
                local = "C";
            }
            output = output + "+" + local;
            result = 1;
            checked[0][c] = 1;
            checked[1][c] = 1;
            checked[2][c] = 1;
            checked[3][c] = 1;
            checked[0][(4 + (c - 1)) % 4] = 1;
            checked[1][(4 + (c - 1)) % 4] = 1;
            checked[2][(4 + (c - 1)) % 4] = 1;
            checked[3][(4 + (c - 1)) % 4] = 1;
        }

        return result;
    }

    static int check4(int r, int c) {
        int result = 0;
        String local = "";
        if (A[r][0] == 1 && A[r][1] == 1 && A[r][2] == 1 && A[r][3] == 1) {
            if (r == 0) {
                local = "A'B'";
            }
            if (r == 1) {
                local = "A'B";
            }
            if (r == 2) {
                local = "AB";
            }
            if (r == 3) {
                local = "AB'";
            }
            output = output + "+" + local;
            result = 1;
            checked[r][0] = 1;
            checked[r][1] = 1;
            checked[r][2] = 1;
            checked[r][3] = 1;
        } else if (A[0][c] == 1 && A[1][c] == 1 && A[2][c] == 1 && A[3][c] == 1) {
            if (c == 0) {
                local = "C'D'";
            }
            if (c == 1) {
                local = "C'D";
            }
            if (c == 2) {
                local = "CD";
            }
            if (c == 3) {
                local = "CD'";
            }
            output = output + "+" + local;
            result = 1;
            checked[0][c] = 1;
            checked[1][c] = 1;
            checked[2][c] = 1;
            checked[3][c] = 1;
        } else if (A[r][c] == 1 && A[r][(c + 1) % 4] == 1 && A[(r + 1) % 4][c] == 1 && A[(r + 1) % 4][(c + 1) % 4] == 1) {
            if (r == 0) {
                local = "A'";
            }
            if (r == 1) {
                local = "B";
            }
            if (r == 2) {
                local = "A";
            }
            if (r == 3) {
                local = "B'";
            }
            if (c == 0) {
                local = local + "C'";
            }
            if (c == 1) {
                local = local + "D";
            }
            if (c == 2) {
                local = local + "C";
            }
            if (c == 3) {
                local = local + "D'";
            }
            output = output + "+" + local;
            result = 1;
            checked[r][c] = 1;
            checked[r][(c + 1) % 4] = 1;
            checked[(r + 1) % 4][c] = 1;
            checked[(r + 1) % 4][(c + 1) % 4] = 1;
        } else if (A[r][(4 + (c - 1)) % 4] == 1 && A[r][c] == 1 && A[(r + 1) % 4][(4 + (c - 1)) % 4] == 1 && A[(r + 1) % 4][c] == 1) {
            if (r == 0) {
                local = "A'";
            }
            if (r == 1) {
                local = "B";
            }
            if (r == 2) {
                local = "A";
            }
            if (r == 3) {
                local = "B'";
            }
            if (c == 0) {
                local = local + "D'";
            }
            if (c == 1) {
                local = local + "C'";
            }
            if (c == 2) {
                local = local + "D";
            }
            if (c == 3) {
                local = local + "C'";
            }
            output = output + "+" + local;
            result = 1;
            checked[r][(4 + (c - 1)) % 4] = 1;
            checked[r][c] = 1;
            checked[(r + 1) % 4][(4 + (c - 1)) % 4] = 1;
            checked[(r + 1) % 4][c] = 1;
        } else if (A[(4 + (r - 1)) % 4][(4 + (c - 1)) % 4] == 1 && A[(4 + (r - 1)) % 4][c] == 1 && A[r][(4 + (c - 1)) % 4] == 1 && A[r][c] == 1) {
            if (r == 0) {
                local = "B'";
            }
            if (r == 1) {
                local = "A'";
            }
            if (r == 2) {
                local = "B";
            }
            if (r == 3) {
                local = "A";
            }
            if (c == 0) {
                local = local + "D'";
            }
            if (c == 1) {
                local = local + "C'";
            }
            if (c == 2) {
                local = local + "D";
            }
            if (c == 3) {
                local = local + "C'";
            }
            output = output + "+" + local;
            result = 1;
            checked[(4 + (r - 1)) % 4][(4 + (c - 1)) % 4] = 1;
            checked[(4 + (r - 1)) % 4][c] = 1;
            checked[r][(4 + (c - 1)) % 4] = 1;
            checked[r][c] = 1;
        } else if (A[(4 + (r - 1)) % 4][c] == 1 && A[(4 + (r - 1)) % 4][(c + 1) % 4] == 1 && A[r][c] == 1 && A[r][(c + 1) % 4] == 1) {
            if (r == 0) {
                local = "B'";
            }
            if (r == 1) {
                local = "A'";
            }
            if (r == 2) {
                local = "B";
            }
            if (r == 3) {
                local = "A";
            }
            if (c == 0) {
                local = local + "C'";
            }
            if (c == 1) {
                local = local + "D";
            }
            if (c == 2) {
                local = local + "C";
            }
            if (c == 3) {
                local = local + "D'";
            }
            output = output + "+" + local;
            result = 1;
            checked[(4 + (r - 1)) % 4][c] = 1;
            checked[(4 + (r - 1)) % 4][(c + 1) % 4] = 1;
            checked[r][c] = 1;
            checked[r][(c + 1) % 4] = 1;
        }
        return result;
    }

    static int check4for3(int r, int c) {
        int result = 0;
        String local = "";

        if (A3[r][0] == 1 && A3[r][1] == 1 && A3[r][2] == 1 && A3[r][3] == 1) {
            if (r == 0) {
                local = "A'";
            }
            if (r == 1) {
                local = "A";
            }
            output3 = output3 + "+" + local;
            result = 1;
            checked3[r][0] = 1;
            checked3[r][1] = 1;
            checked3[r][2] = 1;
            checked3[r][3] = 1;
        } else if (A3[0][0] == 1 && A3[1][0] == 1 && A3[0][3] == 1 && A3[1][3] == 1) {
            local = local + "C'";
            output3 = output3 + "+" + local;
            result = 1;
            checked3[0][0] = 1;
            checked3[1][0] = 1;
            checked3[0][3] = 1;
            checked3[1][3] = 1;
        }
        if (A3[r][c] == 1 && A3[r][(c + 1) % 4] == 1 && A3[(r + 1) % 2][c] == 1 && A3[(r + 1) % 2][(c + 1) % 4] == 1) {
            if (r == 0 && c == 0) {
                local = "B'";
            }
            if (r == 0 && c == 1) {
                local = "C";
            }
            if (r == 0 && c == 2) {
                local = local + "B";
            }
            output3 = output3 + "+" + local;
            result = 1;
            checked3[r][c] = 1;
            checked3[r][(c + 1) % 4] = 1;
            checked3[(r + 1) % 2][c] = 1;
            checked3[(r + 1) % 2][(c + 1) % 4] = 1;
        }

        return result;
    }

    static int check2(int r, int c) {
        int result = 0;
        String local = "";
        if (A[r][c] == 1 && A[r][(c + 1) % 4] == 1) {
            if (r == 0) {
                local = "A'B'";
            }
            if (r == 1) {
                local = "A'B";
            }
            if (r == 2) {
                local = "AB";
            }
            if (r == 3) {
                local = "AB'";
            }
            if (c == 0) {
                local = local + "C'";
            }
            if (c == 1) {
                local = local + "D";
            }
            if (c == 2) {
                local = local + "C";
            }
            if (c == 3) {
                local = local + "D'";
            }
            output = output + "+" + local;
            result = 1;
            checked[r][c] = 1;
            checked[r][(c + 1) % 4] = 1;

        } else if (A[r][(4 + (c - 1)) % 4] == 1 && A[r][c] == 1) {
            if (r == 0) {
                local = "A'B'";
            }
            if (r == 1) {
                local = "A'B";
            }
            if (r == 2) {
                local = "AB";
            }
            if (r == 3) {
                local = "AB'";
            }
            if (c == 0) {
                local = local + "D'";
            }
            if (c == 1) {
                local = local + "C'";
            }
            if (c == 2) {
                local = local + "D";
            }
            if (c == 3) {
                local = local + "C";
            }
            output = output + "+" + local;
            result = 1;
            checked[r][(4 + (c - 1)) % 4] = 1;
            checked[r][c] = 1;
        } else if (A[r][c] == 1 && A[(r + 1) % 4][c] == 1) {
            if (r == 0) {
                local = "A'";
            }
            if (r == 1) {
                local = "B";
            }
            if (r == 2) {
                local = "A";
            }
            if (r == 3) {
                local = "B'";
            }
            if (c == 0) {
                local = local + "C'D'";
            }
            if (c == 1) {
                local = local + "C'D";
            }
            if (c == 2) {
                local = local + "CD";
            }
            if (c == 3) {
                local = local + "CD'";
            }
            output = output + "+" + local;
            result = 1;
            checked[r][c] = 1;
            checked[(r + 1) % 4][c] = 1;
        } else if (A[r][c] == 1 && A[(4 + (r - 1)) % 4][c] == 1) {
            if (r == 0) {
                local = "B'";
            }
            if (r == 1) {
                local = "A'";
            }
            if (r == 2) {
                local = "B";
            }
            if (r == 3) {
                local = "A";
            }
            if (c == 0) {
                local = local + "C'D'";
            }
            if (c == 1) {
                local = local + "C'D";
            }
            if (c == 2) {
                local = local + "CD";
            }
            if (c == 3) {
                local = local + "CD'";
            }
            output = output + "+" + local;
            result = 1;
            checked[r][c] = 1;
            checked[(4 + (r - 1)) % 4][c] = 1;
        }
        return result;
    }

    static int check2for3(int r, int c) {
        int result = 0;
        String local = "";
        if (A3[0][0] == 1 && A3[0][3] == 1) {
            local = local + "A'C'";
            output3 = output3 + "+" + local;
            result = 1;
            checked3[0][0] = 1;
            checked3[0][3] = 1;
        }
        if (A3[1][0] == 1 && A3[1][3] == 1) {
            local = local + "AC'";
            output3 = output3 + "+" + local;
            result = 1;
            checked3[1][0] = 1;
            checked3[1][3] = 1;
        }
        if (A3[r][c] == 1 && A3[r][(c + 1) % 4] == 1) {
            if (r == 0 && c == 0) {
                local = "A'B'";
            }
            if (r == 0 && c == 1) {
                local = "A'C";
            }
            if (r == 0 && c == 2) {
                local = local + "A'B";
            }
            if (r == 1 && c == 0) {
                local = local + "AB'";
            }
            if (r == 1 && c == 1) {
                local = local + "AC";
            }
            if (r == 1 && c == 2) {
                local = local + "AB";
            }
            output3 = output3 + "+" + local;
            result = 1;
            checked3[r][c] = 1;
            checked3[r][(c + 1) % 4] = 1;
        } else if (A3[r][c] == 1 && A3[(r + 1) % 2][c] == 1) {
            if (r == 0 && c == 0) {
                local = "B'C'";
            }
            if (r == 0 && c == 1) {
                local = "B'C";
            }
            if (r == 0 && c == 2) {
                local = local + "BC";
            }
            if (r == 0 && c == 3) {
                local = local + "BC'";
            }
            output3 = output3 + "+" + local;
            result = 1;
            checked3[r][c] = 1;
            checked3[(r + 1) % 2][c] = 1;
        }
        return result;
    }

    static int check2for2(int r, int c) {
        int result = 0;
        String local = "";
        if (A2[0][0] == 1 && A2[0][1] == 1) {
            local = local + "A'";
            output2 = output2 + "+" + local;
            result = 1;
            checked2[0][0] = 1;
            checked2[0][1] = 1;
        }
        if (A2[1][0] == 1 && A2[1][1] == 1) {
            local = local + "A";
            output2 = output2 + "+" + local;
            result = 1;
            checked2[1][0] = 1;
            checked2[1][1] = 1;
        }
        if (A2[0][0] == 1 && A2[1][0] == 1) {
            local = local + "B'";
            output2 = output2 + "+" + local;
            result = 1;
            checked2[0][0] = 1;
            checked2[1][0] = 1;
        }
        if (A2[0][1] == 1 && A2[1][1] == 1) {
            local = local + "B";
            output2 = output2 + "+" + local;
            result = 1;
            checked2[0][1] = 1;
            checked2[1][1] = 1;
        }
        if (A2[0][0] == 1 && A2[0][1] == 1 && A2[1][0] == 1) {
            local = local + "A'+B'";
            output2 = output2 + "+" + local;
            result = 1;
            checked2[0][0] = 1;
            checked2[0][1] = 1;
            checked2[1][0] = 1;
        }

        return result;
    }

    static int check3for2(int r, int c) {
        int result = 0;
        String local = "";
        if (A2[0][0] == 1 && A2[0][1] == 1 && A2[1][0] == 1) {
            local = local + "A'+B'";
            output2 = output2 + "+" + local;
            result = 1;
            checked2[0][0] = 1;
            checked2[0][1] = 1;
            checked2[1][0] = 1;
        }
        if (A2[1][1] == 1 && A2[0][1] == 1 && A2[1][0] == 1) {
            local = local + "A+B";
            output2 = output2 + "+" + local;
            result = 1;
            checked2[1][1] = 1;
            checked2[0][1] = 1;
            checked2[1][0] = 1;
        }
        return result;
    }

    static void nogrouping(int r, int c) {
        String local = "";
        if (r == 0) {
            local = "A'B'";
        }
        if (r == 1) {
            local = "A'B";
        }
        if (r == 2) {
            local = "AB";
        }
        if (r == 3) {
            local = "AB'";
        }
        if (c == 0) {
            local = local + "C'D'";
        }
        if (c == 1) {
            local = local + "C'D";
        }
        if (c == 2) {
            local = local + "CD";
        }
        if (c == 3) {
            local = local + "CD'";
        }
        output = output + "+" + local;

        checked[r][c] = 1;
    }

    static void nogrouping3(int r, int c) {
        String local = "";
        if (r == 0) {
            local = "A'";
        }
        if (r == 1) {
            local = "A";
        }
        if (c == 0) {
            local = local + "B'C'";
        }
        if (c == 1) {
            local = local + "B'C";
        }
        if (c == 2) {
            local = local + "BC";
        }
        if (c == 3) {
            local = local + "BC'";
        }
        output3 = output3 + "+" + local;

        checked3[r][c] = 1;
    }

    static void nogrouping2(int r, int c) {
        String local = "";
        if (r == 0) {
            local = "A'";
        }
        if (r == 1) {
            local = "A";
        }
        if (c == 0) {
            local = local + "B'";
        }
        if (c == 1) {
            local = local + "B";
        }
        output2 = output2 + "+" + local;

        checked2[r][c] = 1;
    }

    static void initialize() {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = value[count];
                checked[i][j] = 0;
                count++;
            }
        }
    }

    static void initialize3() {
        int count = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                A3[i][j] = value3[count];
                checked3[i][j] = 0;
                count++;
            }
        }
    }

    static void initialize2() {
        int count = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A2[i][j] = value2[count];
                checked2[i][j] = 0;
                count++;
            }
        }
    }

    public static void main(String args[]) {
        kmapping object = new kmapping();
    }

}
