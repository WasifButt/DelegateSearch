/*
Game Concept and Code by Wasif Ahmad 
Character sprites were created using: http://charas-project.net/charas2/index.php
*********************************PLEASE DO NOT CHANGE ANYTHING BELOW THIS LINE*************************************************************
*/
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class IBMC extends Applet implements ActionListener
{
    int row = 15;
    int col = 10;
    int row2 = 3;
    JButton cafgrid[] = new JButton [row * col];
    int gridtrack[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 1, 1, 1, 6, 6, 7, 6, 6, 1, 1, 1, 0, 0,
        0, 22, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0,
        0, 22, 2, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0,
        0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0,
        0, 33, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0,
        0, 33, 3, 1, 1, 1, 1, 1, 1, 50, 7, 50, 50, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    int gridtrack2[] = {7, 1, 1, 1, 1, 70, 70, 1, 7, 50, 1, 1, 1, 1, 1,
        1, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 1,
        1, 8, 1, 12, 12, 12, 12, 1, 12, 12, 12, 12, 1, 8, 60,
        1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 60,
        60, 8, 1, 12, 12, 12, 1, 1, 1, 12, 12, 12, 1, 8, 60,
        1, 8, 1, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 8, 1,
        1, 8, 1, 12, 12, 12, 12, 1, 12, 12, 12, 12, 1, 8, 1,
        1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 1,
        1, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 1,
        1, 10, 10, 100, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5};

    int gridtrack3[] = {0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        50, 1, 1, 1, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 10,
        50, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    int gridtrack4[] = {0, 0, 0, 0, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 7, 1, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 1, 1, 60, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 1, 1, 60, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 1, 1, 60, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0};

    int gridtrack5[] =
        {0, 0, 0, 0, 50, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        50, 1, 7, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        50, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 60,
        50, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 60,
        50, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0,
        0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 7, 0, 0,
        0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0,
        0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 5, 5, 0, 0};

    int room = 1;
    int music = 1;
    int charnum = 1;
    int delegatenum = 1;
    int securitynum = 1;
    int benchnum = 1;
    char Pdirec = 'z';
    JButton gamepad[] = new JButton [row2 * row2];
    int charpos = 82;
    int Dfound = 12;
    JLabel prompt;
    Panel p_card;
    Panel card1, card2, card3, card4, card5, card6;
    CardLayout cdLayout = new CardLayout ();

    public void init ()
    {
        p_card = new Panel ();
        p_card.setLayout (cdLayout);
        screen1 ();
        screen2 ();
        //screen3 ();
        resize (350, 150);
        setLayout (new BorderLayout ());
        add ("Center", p_card);
    }


    public void screen1 ()
    {
        card1 = new Panel ();
        card1.setBackground (new Color (30, 189, 242));

        JLabel title = new JLabel ("IBMC Delegate Search");
        title.setFont (new Font ("Jokerman", Font.BOLD, 25));

        JButton play = new JButton ("   Start Game   ");
        play.setBackground (new Color (204, 0, 31));
        play.addActionListener (this);
        play.setActionCommand ("2a");

        JButton instr = new JButton ("     Instructions     ");
        instr.setBackground (new Color (204, 0, 31));
        instr.addActionListener (this);
        instr.setActionCommand ("3a");

        /*JButton op = new JButton ("   Options   ");
        op.setBackground (new Color (204, 0, 31));
        op.addActionListener (this);
        op.setActionCommand ("4a");*/

        card1.add (title);
        card1.add (play);
        card1.add (instr);
        //card1.add (op);
        p_card.add ("1", card1);
    }
    
    public void screen2 ()
    {
        card2 = new Panel ();
        card2.setBackground (new Color (200, 191, 231));
        Panel f = new Panel (new GridLayout (10, 5));
        for (int i = 0 ; i < cafgrid.length ; i++)
        {

            cafgrid [i] = new JButton ();
            cafgrid [i].setPreferredSize (new Dimension (34, 35));
            cafgrid [i].setBackground (new Color (239, 230, 175));
            f.add (cafgrid [i]);
            cafgrid [i].setBorderPainted (false);
        }

        Panel g = new Panel (new GridLayout (3, 3));
        for (int z = 0 ; z < gamepad.length ; z++)
        {
            gamepad [z] = new JButton ("");
            gamepad [z].addActionListener (this);
            gamepad [z].setActionCommand ("levelcontrol" + z);
            gamepad [z].setPreferredSize (new Dimension (50, 50));
            gamepad [z].setBorderPainted (false);
            g.add (gamepad [z]);
            if (z % 2 == 0)
            {
                gamepad [z].setEnabled (false);
                gamepad [z].setBackground (new Color (200, 191, 231));
            }

            else if (z % 2 != 0)
                gamepad [z].setIcon (createImageIcon ("control" + z + ".png"));
        }
        JButton ex = new JButton ("Examine");
        ex.setBackground (Color.red);
        ex.addActionListener (this);
        ex.setActionCommand ("examine");

        prompt = new JLabel ("Prompts will appear here. " + Dfound + " delegates to go.                                  ");
        prompt.setFont (new Font ("Comic Sans MS", Font.BOLD, 15));

        card2.add (f);
        card2.add (g);
        card2.add (ex);
        card2.add (prompt);
        p_card.add ("2", card2);

    }


    public void actionPerformed (ActionEvent e)
    {
        if (e.getActionCommand ().equals ("1a"))
        {
            resize (350, 150);
            cdLayout.show (p_card, "1");
        }
        if (e.getActionCommand ().equals ("3a"))
        {
            JOptionPane.showMessageDialog (null, "It's IBMC conference day! You and your group got super lit after eating a bunch of candy.", "Instructions", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog (null, "Sadly they all had a sugar rush and scattered off while moving to another room.", "Instructions", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog (null, "Your goal is to find all 12 of your delegates; they're wearing red shirts.", "Instructions", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog (null, "Use the arrow keys on the screen to walk around the school. Use your \"Examine\" button to inspect things your character is looking at.", "Instructions", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog (null, "Room entrances are indicated by red arrows on the screen, press \"Examine\" to enter that room.", "Instructions", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog (null, "You can also interact with other characters using the \"Examine\" button", "Instructions", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog (null, "Once the game starts to return to the main menu you must close the window.", "Instructions", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog (null, "If the screen looks weird/broken just tap the side of the window and it should re-adjust fine, if not just slightly resize the window.\nDO NOT PLAY IN FULLSCREEN.", "Instructions", JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog (null, "Be sure to check out the options! \nEnjoy :)", "Instructions", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog (null, "Enjoy :)", "Instructions", JOptionPane.INFORMATION_MESSAGE);
        }

        else if (e.getActionCommand ().equals ("2a"))
        {
            resize (780, 430);
            cdLayout.show (p_card, "2");
            gridtrack [charpos] = 100;
            for (int i = 0 ; i < cafgrid.length ; i++)
            {
                if (gridtrack [i] == 0 || gridtrack [i] == 22 || gridtrack [i] == 33)
                    cafgrid [i].setBackground (Color.black);
                else if (gridtrack [i] == 100)
                    cafgrid [i].setIcon (createImageIcon ("char" + charnum + "f.png"));
                else if (gridtrack [i] == 7)
                {
                    cafgrid [i].setIcon (createImageIcon ("Delegate" + delegatenum + ".png"));
                    delegatenum++;
                }
                else if (gridtrack [i] == 50)
                {
                    cafgrid [i].setIcon (createImageIcon ("Security" + securitynum + ".png"));
                    securitynum++;
                }
                else if (gridtrack [i] == 6)
                {
                    cafgrid [i].setIcon (createImageIcon ("Bench" + benchnum + ".png"));
                    benchnum++;
                    if (benchnum > 2)
                        benchnum = 1;
                }
                else if (gridtrack [i] == 2 || gridtrack [i] == 3)
                    cafgrid [i].setIcon (createImageIcon ("leftEnter.png"));
            }
        }
        //*************************************************************************************************************************************************
        else if (e.getActionCommand ().equals ("levelcontrol1"))
        {
            prompt.setText ("Prompts will appear here. " + Dfound + " delegates to go.");
            if (room == 1)
            {
                if (gridtrack [charpos - 15] != 0 && gridtrack [charpos - 15] != 7 && gridtrack [charpos - 15] != 50 && gridtrack [charpos - 15] != 6 && gridtrack [charpos - 15] != 22)
                {
                    if (gridtrack [charpos] == 2 || gridtrack [charpos] == 3)
                        cafgrid [charpos].setIcon (createImageIcon ("leftEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);
                    charpos = charpos - 15;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "b.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "b.png"));
                Pdirec = 'b';
            }
            else if (room == 2)
            {
                if (!(charpos - 15 < 0) && gridtrack2 [charpos - 15] != 7 && gridtrack2 [charpos - 15] != 50 && gridtrack2 [charpos - 15] != 12 && gridtrack2 [charpos - 15] != 22 && gridtrack2 [charpos - 15] != 70 && gridtrack2 [charpos - 15] != 60)
                {
                    if (gridtrack2 [charpos] == 10)
                        cafgrid [charpos].setIcon (createImageIcon ("bottomEnter.png"));
                    else if (gridtrack2 [charpos] == 5)
                        cafgrid [charpos].setIcon (createImageIcon ("rightEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);
                    charpos = charpos - 15;
                    if (gridtrack2 [charpos] == 8)
                        cafgrid [charpos].setIcon (createImageIcon ("charb" + charnum + "b.png"));
                    else
                        cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "b.png"));
                }
                else if (gridtrack2 [charpos] == 8)
                    cafgrid [charpos].setIcon (createImageIcon ("charb" + charnum + "b.png"));
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "b.png"));
                Pdirec = 'b';
            }
            else if (room == 3)
            {
                if (!(charpos - 15 < 0) && gridtrack3 [charpos - 15] != 7 && gridtrack3 [charpos] != 4 && gridtrack3 [charpos - 15] != 0)
                {
                    if (gridtrack3 [charpos] == 10)
                        cafgrid [charpos].setIcon (createImageIcon ("rightEnter.png"));
                    else if (gridtrack3 [charpos] == 4)
                        cafgrid [charpos].setIcon (createImageIcon ("upEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);

                    charpos = charpos - 15;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "b.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "b.png"));
                Pdirec = 'b';
            }
            else if (room == 4)
            {
                if (!(charpos - 15 < 0) && gridtrack4 [charpos - 15] != 7 && gridtrack4 [charpos] != 4 && gridtrack4 [charpos - 15] != 0 && gridtrack4 [charpos - 15] != 60)
                {
                    if (gridtrack4 [charpos] == 2)
                        cafgrid [charpos].setIcon (createImageIcon ("bottomEnter.png"));
                    else if (gridtrack4 [charpos] == 5)
                        cafgrid [charpos].setIcon (createImageIcon ("upEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);

                    charpos = charpos - 15;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "b.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "b.png"));
                Pdirec = 'b';
            }
            else if (room == 5)
            {
                if (gridtrack5 [charpos - 15] != 7 && gridtrack5 [charpos - 15] != 50 && gridtrack5 [charpos - 15] != 0)
                {
                    if (gridtrack5 [charpos] == 3 || gridtrack5 [charpos] == 5)
                        cafgrid [charpos].setIcon (createImageIcon ("bottomEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);

                    charpos = charpos - 15;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "b.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "b.png"));
                Pdirec = 'b';
            }
        }
        //*************************************************************************************************************************************************
        else if (e.getActionCommand ().equals ("levelcontrol3"))
        {
            prompt.setText ("Prompts will appear here. " + Dfound + " delegates to go.");
            if (room == 1)
            {
                if (gridtrack [charpos - 1] != 0 && gridtrack [charpos - 1] != 7 && gridtrack [charpos - 1] != 50 && gridtrack [charpos - 1] != 6 && gridtrack [charpos - 1] != 22 && gridtrack [charpos - 1] != 33)
                {
                    if (gridtrack [charpos] == 2 || gridtrack [charpos] == 3)
                        cafgrid [charpos].setIcon (createImageIcon ("leftEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);
                    charpos = charpos - 1;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "l.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "l.png"));
                Pdirec = 'r';
            }
            else if (room == 2)
            {
                if (charpos % 15 != 0 && gridtrack2 [charpos - 1] != 7 && gridtrack2 [charpos - 1] != 50 && gridtrack2 [charpos - 1] != 12 && gridtrack2 [charpos - 1] != 22 && gridtrack2 [charpos - 1] != 70 && gridtrack2 [charpos - 1] != 60)
                {
                    if (gridtrack2 [charpos] == 10)
                        cafgrid [charpos].setIcon (createImageIcon ("bottomEnter.png"));
                    else if (gridtrack2 [charpos] == 5)
                        cafgrid [charpos].setIcon (createImageIcon ("rightEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);
                    charpos = charpos - 1;
                    if (gridtrack2 [charpos] == 8)
                        cafgrid [charpos].setIcon (createImageIcon ("charb" + charnum + "l.png"));
                    else
                        cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "l.png"));
                }
                else if (gridtrack2 [charpos] == 8)
                    cafgrid [charpos].setIcon (createImageIcon ("charb" + charnum + "l.png"));
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "l.png"));
                Pdirec = 'r';
            }
            else if (room == 3)
            {
                if (gridtrack3 [charpos - 1] != 7 && gridtrack3 [charpos - 1] != 50 && gridtrack3 [charpos - 1] != 0)
                {
                    if (gridtrack3 [charpos] == 10)
                        cafgrid [charpos].setIcon (createImageIcon ("rightEnter.png"));
                    else if (gridtrack3 [charpos] == 4)
                        cafgrid [charpos].setIcon (createImageIcon ("upEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);

                    charpos = charpos - 1;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "l.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "l.png"));
                Pdirec = 'r';
            }
            else if (room == 4)
            {
                if (gridtrack4 [charpos - 1] != 7 && gridtrack4 [charpos - 1] != 60 && gridtrack4 [charpos - 1] != 0)
                {
                    if (gridtrack4 [charpos] == 2)
                        cafgrid [charpos].setIcon (createImageIcon ("bottomEnter.png"));
                    else if (gridtrack4 [charpos] == 5)
                        cafgrid [charpos].setIcon (createImageIcon ("upEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);

                    charpos = charpos - 1;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "l.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "l.png"));
                Pdirec = 'r';
            }
            else if (room == 5)
            {
                if (gridtrack5 [charpos - 1] != 7 && gridtrack5 [charpos - 1] != 50 && gridtrack5 [charpos - 1] != 0)
                {
                    if (gridtrack5 [charpos] == 3 || gridtrack5 [charpos] == 5)
                        cafgrid [charpos].setIcon (createImageIcon ("bottomEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);

                    charpos = charpos - 1;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "l.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "l.png"));
                Pdirec = 'r';
            }
        }
        //*************************************************************************************************************************************************
        else if (e.getActionCommand ().equals ("levelcontrol5"))
        {
            prompt.setText ("Prompts will appear here. " + Dfound + " delegates to go.");
            if (room == 1)
            {
                if (gridtrack [charpos + 1] != 0 && gridtrack [charpos + 1] != 7 && gridtrack [charpos + 1] != 50 && gridtrack [charpos + 1] != 6 && gridtrack [charpos + 1] != 22)
                {
                    if (gridtrack [charpos] == 2 || gridtrack [charpos] == 3)
                        cafgrid [charpos].setIcon (createImageIcon ("leftEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);
                    charpos = charpos + 1;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "r.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "r.png"));
                Pdirec = 'l';
            }
            else if (room == 2)
            {
                if ((charpos) % 15 < (charpos + 1) % 15 && gridtrack2 [charpos + 1] != 7 && gridtrack2 [charpos + 1] != 50 && gridtrack2 [charpos + 1] != 12 && gridtrack2 [charpos + 1] != 22 && gridtrack2 [charpos + 1] != 70 && gridtrack2 [charpos + 1] != 60)
                {
                    if (gridtrack2 [charpos] == 10)
                        cafgrid [charpos].setIcon (createImageIcon ("bottomEnter.png"));
                    else if (gridtrack2 [charpos] == 5)
                        cafgrid [charpos].setIcon (createImageIcon ("rightEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);
                    charpos = charpos + 1;
                    if (gridtrack2 [charpos] == 8)
                        cafgrid [charpos].setIcon (createImageIcon ("charb" + charnum + "r.png"));
                    else
                        cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "r.png"));
                }
                else if (gridtrack2 [charpos] == 8)
                    cafgrid [charpos].setIcon (createImageIcon ("charb" + charnum + "r.png"));
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "r.png"));
                Pdirec = 'l';
            }
            else if (room == 3)
            {
                if ((charpos) % 15 < (charpos + 1) % 15 && gridtrack3 [charpos + 1] != 7 && gridtrack3 [charpos + 1] != 0)
                {
                    if (gridtrack3 [charpos] == 10)
                        cafgrid [charpos].setIcon (createImageIcon ("rightEnter.png"));
                    else if (gridtrack3 [charpos] == 4)
                        cafgrid [charpos].setIcon (createImageIcon ("upEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);

                    charpos = charpos + 1;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "r.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "r.png"));
                Pdirec = 'l';
            }
            else if (room == 4)
            {
                if ((charpos) % 15 < (charpos + 1) % 15 && gridtrack4 [charpos + 1] != 7 && gridtrack4 [charpos + 1] != 0 && gridtrack4 [charpos + 1] != 60)
                {
                    if (gridtrack4 [charpos] == 2)
                        cafgrid [charpos].setIcon (createImageIcon ("bottomEnter.png"));
                    else if (gridtrack4 [charpos] == 5)
                        cafgrid [charpos].setIcon (createImageIcon ("upEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);

                    charpos = charpos + 1;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "r.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "r.png"));
                Pdirec = 'l';
            }
            else if (room == 5)
            {
                if (gridtrack5 [charpos + 1] != 7 && gridtrack5 [charpos + 1] != 0 && gridtrack5 [charpos + 1] != 60)
                {
                    if (gridtrack5 [charpos] == 3 || gridtrack5 [charpos] == 5)
                        cafgrid [charpos].setIcon (createImageIcon ("bottomEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);

                    charpos = charpos + 1;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "r.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "r.png"));
                Pdirec = 'l';
            }
        }
        //*************************************************************************************************************************************************
        else if (e.getActionCommand ().equals ("levelcontrol7"))
        {
            prompt.setText ("Prompts will appear here. " + Dfound + " delegates to go.");
            if (room == 1)
            {
                if (gridtrack [charpos + 15] != 0 && gridtrack [charpos + 15] != 7 && gridtrack [charpos + 15] != 50 && gridtrack [charpos + 15] != 6 && gridtrack [charpos + 15] != 22)
                {
                    if (gridtrack [charpos] == 2 || gridtrack [charpos] == 3)
                        cafgrid [charpos].setIcon (createImageIcon ("leftEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);
                    charpos = charpos + 15;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "f.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "f.png"));
                Pdirec = 'f';
            }
            else if (room == 2)
            {
                if (!(charpos + 15 >= 150) && gridtrack2 [charpos + 15] != 7 && gridtrack2 [charpos + 15] != 50 && gridtrack2 [charpos + 15] != 12 && gridtrack2 [charpos + 15] != 22 && gridtrack2 [charpos + 15] != 70 && gridtrack2 [charpos + 15] != 60)
                {
                    if (gridtrack2 [charpos] == 10)
                        cafgrid [charpos].setIcon (createImageIcon ("bottomEnter.png"));
                    else if (gridtrack2 [charpos] == 5)
                        cafgrid [charpos].setIcon (createImageIcon ("rightEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);

                    charpos = charpos + 15;
                    if (gridtrack2 [charpos] == 8)
                        cafgrid [charpos].setIcon (createImageIcon ("charb" + charnum + "f.png"));
                    else
                        cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "f.png"));
                }
                else if (gridtrack2 [charpos] == 8)
                    cafgrid [charpos].setIcon (createImageIcon ("charb" + charnum + "f.png"));
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "f.png"));
                Pdirec = 'f';
            }
            else if (room == 3)
            {
                if (gridtrack3 [charpos + 15] != 7 && gridtrack3 [charpos + 15] != 0)
                {
                    if (gridtrack3 [charpos] == 10)
                        cafgrid [charpos].setIcon (createImageIcon ("rightEnter.png"));
                    else if (gridtrack3 [charpos] == 4)
                        cafgrid [charpos].setIcon (createImageIcon ("upEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);

                    charpos = charpos + 15;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "f.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "f.png"));
                Pdirec = 'f';
            }
            else if (room == 4)
            {
                if (!(charpos + 15 >= 150) && gridtrack4 [charpos + 15] != 7 && gridtrack4 [charpos + 15] != 0)
                {
                    if (gridtrack4 [charpos] == 2)
                        cafgrid [charpos].setIcon (createImageIcon ("bottomEnter.png"));
                    else if (gridtrack4 [charpos] == 5)
                        cafgrid [charpos].setIcon (createImageIcon ("upEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);

                    charpos = charpos + 15;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "f.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "f.png"));
                Pdirec = 'f';
            }
            else if (room == 5)
            {
                if (!(charpos + 15 >= 150) && gridtrack5 [charpos + 15] != 7 && gridtrack5 [charpos + 15] != 0)
                {
                    if (gridtrack5 [charpos] == 3 || gridtrack5 [charpos] == 5)
                        cafgrid [charpos].setIcon (createImageIcon ("bottomEnter.png"));
                    else
                        cafgrid [charpos].setIcon (null);

                    charpos = charpos + 15;
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "f.png"));
                }
                else
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "f.png"));
                Pdirec = 'f';
            }
        }
        //*************************************************************************************************************************************************
        else if (e.getActionCommand ().equals ("examine"))
        {
            //System.out.print("work");
            if (room == 1)
            {
                if ((Pdirec == 'f' && gridtrack [charpos + 15] == 0) || (Pdirec == 'b' && gridtrack [charpos - 15] == 0) || (Pdirec == 'l' && gridtrack [charpos + 1] == 0) || (Pdirec == 'r' && gridtrack [charpos - 1] == 0))
                    prompt.setText ("Nothing there...");
                else if ((Pdirec == 'f' && gridtrack [charpos + 15] == 6) || (Pdirec == 'b' && gridtrack [charpos - 15] == 6) || (Pdirec == 'l' && gridtrack [charpos + 1] == 6) || (Pdirec == 'r' && gridtrack [charpos - 1] == 6))
                    prompt.setText ("No time to sit!");
                else if ((Pdirec == 'f' && gridtrack [charpos + 15] == 50) || (Pdirec == 'b' && gridtrack [charpos - 15] == 50) || (Pdirec == 'l' && gridtrack [charpos + 1] == 50) || (Pdirec == 'r' && gridtrack [charpos - 1] == 50))
                    prompt.setText ("The Security sure does have a large budget this year....");
                else if ((Pdirec == 'f' && gridtrack [charpos + 15] == 7) || (Pdirec == 'b' && gridtrack [charpos - 15] == 7) || (Pdirec == 'l' && gridtrack [charpos + 1] == 7) || (Pdirec == 'r' && gridtrack [charpos - 1] == 7))
                {
                    if (gridtrack [charpos + 15] == 7)
                    {
                        cafgrid [charpos + 15].setIcon (null);
                        gridtrack [charpos + 15] = 1;
                    }
                    else if (gridtrack [charpos - 15] == 7)
                    {
                        cafgrid [charpos - 15].setIcon (null);
                        gridtrack [charpos - 15] = 1;
                    }
                    else if (gridtrack [charpos + 1] == 7)
                    {
                        cafgrid [charpos + 1].setIcon (null);
                        gridtrack [charpos + 1] = 1;
                    }
                    else if (gridtrack [charpos - 1] == 7)
                    {
                        cafgrid [charpos - 1].setIcon (null);
                        gridtrack [charpos - 1] = 1;
                    }
                    prompt.setText ("You found a Delegate! You used your MD powers to teleport them to safety.");
                    Dfound--;
                }
                else if ((Pdirec == 'l' && gridtrack [charpos + 1] == 22) || (Pdirec == 'r' && gridtrack [charpos - 1] == 22))
                {
                    music = 1;
                    room = 2;
                    for (int i = 0 ; i < gridtrack.length ; i++)
                    {
                        cafgrid [i].setIcon (null);
                        cafgrid [i].setBackground (new Color (239, 230, 175));

                        if (gridtrack2 [i] == 8)
                        {
                            cafgrid [i].setIcon (null);
                            cafgrid [i].setBackground (new Color (63, 72, 204));
                        }
                        if (gridtrack2 [i] == 100)
                        {
                            cafgrid [i].setIcon (createImageIcon ("char" + charnum + "b.png"));
                            charpos = i;
                        }
                        if (gridtrack2 [i] == 70)
                        {
                            cafgrid [i].setIcon (createImageIcon ("music" + music + ".png"));
                            music++;
                        }
                        if (gridtrack2 [i] == 50)
                            cafgrid [i].setIcon (createImageIcon ("Security2.png"));
                        if (gridtrack2 [i] == 10)
                            cafgrid [i].setIcon (createImageIcon ("bottomEnter.png"));
                        if (gridtrack2 [i] == 5)
                            cafgrid [i].setIcon (createImageIcon ("rightEnter.png"));
                        if (gridtrack2 [i] == 12)
                            cafgrid [i].setIcon (createImageIcon ("table.png"));
                        if (gridtrack2 [i] == 7)
                        {
                            if (i - 1 == -1)
                                cafgrid [i].setIcon (createImageIcon ("Delegate3.png"));
                            else if (gridtrack2 [i + 1] == 50)
                                cafgrid [i].setIcon (createImageIcon ("Delegate4.png"));
                            else
                                cafgrid [i].setIcon (createImageIcon ("Delegate5.png"));
                        }
                        if (gridtrack2 [i] == 60)
                            cafgrid [i].setIcon (createImageIcon ("CCOM1.png"));
                    }
                    cafgrid [60].setIcon (createImageIcon ("CCOM2.png"));
                }
                else if ((Pdirec == 'l' && gridtrack [charpos + 1] == 33) || (Pdirec == 'r' && gridtrack [charpos - 1] == 33))
                {
                    room = 3;
                    for (int i = 0 ; i < gridtrack.length ; i++)
                    {
                        cafgrid [i].setIcon (null);
                        cafgrid [i].setBackground (new Color (239, 230, 175));

                        if (gridtrack3 [i] == 0)
                            cafgrid [i].setBackground (Color.black);
                        if (gridtrack3 [i] == 50)
                            cafgrid [i].setIcon (createImageIcon ("Security4.png"));
                        if (gridtrack3 [i] == 4)
                            cafgrid [i].setIcon (createImageIcon ("upEnter.png"));
                        if (gridtrack3 [i] == 10)
                            cafgrid [i].setIcon (createImageIcon ("rightEnter.png"));
                        if (gridtrack3 [i] == 7)
                        {
                            if (gridtrack3 [i + 1] == 0)
                                cafgrid [i].setIcon (createImageIcon ("Delegate6.png"));
                            else
                                cafgrid [i].setIcon (createImageIcon ("Delegate7.png"));
                        }
                    }
                    cafgrid [88].setIcon (createImageIcon ("char" + charnum + "l.png"));
                    charpos = 88;
                }
            }
            //*************************************************************************************************************************************************
            else if (room == 2)
            {
                if (charpos + 15 >= 150 || charpos - 15 < -1)
                    prompt.setText ("That's a wall...");
                else if ((Pdirec == 'f' && gridtrack2 [charpos + 15] >= 150) || (Pdirec == 'b' && gridtrack2 [charpos - 15] < -1) && gridtrack2 [charpos] != 10)
                    prompt.setText ("That's a wall...");
                else if ((Pdirec == 'f' && gridtrack2 [charpos + 15] == 12) || (Pdirec == 'b' && gridtrack2 [charpos - 15] == 12) || (Pdirec == 'l' && gridtrack2 [charpos + 1] == 12) || (Pdirec == 'r' && gridtrack2 [charpos - 1] == 12))
                    prompt.setText ("Its not time to eat yet!");
                else if ((Pdirec == 'f' && gridtrack2 [charpos + 15] == 50) || (Pdirec == 'b' && gridtrack2 [charpos - 15] == 50) || (Pdirec == 'l' && gridtrack2 [charpos + 1] == 50) || (Pdirec == 'r' && gridtrack2 [charpos - 1] == 50))
                    prompt.setText ("IBMC troopers definitely wore it the best.");
                else if ((Pdirec == 'f' && gridtrack2 [charpos + 15] == 70) || (Pdirec == 'b' && gridtrack2 [charpos - 15] == 70) || (Pdirec == 'l' && gridtrack2 [charpos + 1] == 70) || (Pdirec == 'r' && gridtrack2 [charpos - 1] == 70))
                    prompt.setText ("Daft Punk performing at IBMC!?!?!?! AHHHHfwfnbuwifbwfkjfahbuiew");
                else if ((Pdirec == 'f' && gridtrack2 [charpos + 15] == 60) || (Pdirec == 'b' && gridtrack2 [charpos - 15] == 60) || (Pdirec == 'l' && gridtrack2 [charpos + 1] == 60) || (Pdirec == 'r' && gridtrack2 [charpos - 1] == 60))
                    prompt.setText ("CCOM does setup a feast, so this Asgardian look works pretty well");
                else if ((Pdirec == 'f' && gridtrack2 [charpos + 15] == 7) || (Pdirec == 'b' && gridtrack2 [charpos - 15] == 7) || (Pdirec == 'l' && gridtrack2 [charpos + 1] == 7) || (Pdirec == 'r' && gridtrack2 [charpos - 1] == 7))
                {
                    if (gridtrack2 [charpos + 15] == 7)
                    {
                        cafgrid [charpos + 15].setIcon (null);
                        gridtrack2 [charpos + 15] = 1;
                    }
                    else if (gridtrack2 [charpos - 15] == 7)
                    {
                        cafgrid [charpos - 15].setIcon (null);
                        gridtrack2 [charpos - 15] = 1;
                    }
                    else if (gridtrack2 [charpos + 1] == 7)
                    {
                        cafgrid [charpos + 1].setIcon (null);
                        gridtrack2 [charpos + 1] = 1;
                    }
                    else if (gridtrack2 [charpos - 1] == 7)
                    {
                        cafgrid [charpos - 1].setIcon (null);
                        gridtrack2 [charpos - 1] = 1;
                    }
                    prompt.setText ("You found a Delegate! You used your MD powers to teleport them to safety.");
                    Dfound--;
                }
                if (gridtrack2 [charpos] == 10)
                {
                    securitynum = 1;
                    room = 1;
                    charpos = 32;
                    for (int i = 0 ; i < cafgrid.length ; i++)
                    {
                        cafgrid [i].setIcon (null);
                        cafgrid [i].setBackground (new Color (239, 230, 175));

                        if (gridtrack [i] == 0 || gridtrack [i] == 22 || gridtrack [i] == 33)
                            cafgrid [i].setBackground (Color.black);
                        else if (gridtrack [i] == 7)
                        {
                            if (gridtrack [i - 1] == 6)
                                cafgrid [i].setIcon (createImageIcon ("Delegate1.png"));
                            else
                                cafgrid [i].setIcon (createImageIcon ("Delegate2.png"));
                        }
                        else if (gridtrack [i] == 50)
                        {
                            cafgrid [i].setIcon (createImageIcon ("Security" + securitynum + ".png"));
                            securitynum++;
                        }
                        else if (gridtrack [i] == 6)
                        {
                            cafgrid [i].setIcon (createImageIcon ("Bench" + benchnum + ".png"));
                            benchnum++;
                            if (benchnum > 2)
                                benchnum = 1;
                        }
                        else if (gridtrack [i] == 2 || gridtrack [i] == 3)
                            cafgrid [i].setIcon (createImageIcon ("leftEnter.png"));
                    }
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "r.png"));
                }
                if (gridtrack2 [charpos] == 5)
                {
                    charpos = 131;
                    room = 5;
                    for (int i = 0 ; i < gridtrack.length ; i++)
                    {
                        cafgrid [i].setIcon (null);
                        cafgrid [i].setBackground (new Color (239, 230, 175));
                        if (gridtrack5 [i] == 3 || gridtrack5 [i] == 5)
                            cafgrid [i].setIcon (createImageIcon ("bottomEnter.png"));
                        if (gridtrack5 [i] == 0)
                            cafgrid [i].setBackground (Color.black);
                        if (gridtrack5 [i] == 7)
                        {
                            if (gridtrack5 [i - 15] == 50)
                                cafgrid [i].setIcon (createImageIcon ("Delegate10.png"));
                            else if (gridtrack5 [i - 15] == 0)
                                cafgrid [i].setIcon (createImageIcon ("Delegate11.png"));
                            else
                                cafgrid [i].setIcon (createImageIcon ("Delegate12.png"));
                        }
                        if (gridtrack5 [i] == 60)
                            cafgrid [i].setIcon (createImageIcon ("CCOM1.png"));
                        if (gridtrack5 [i] == 50)
                        {
                            if (i - 15 < 0)
                                cafgrid [i].setIcon (createImageIcon ("Security3.png"));
                            else
                                cafgrid [i].setIcon (createImageIcon ("Security4.png"));
                        }
                        cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "b.png"));
                    }
                }
            }
            //*************************************************************************************************************************************************
            else if (room == 3)
            {
                if (gridtrack3 [charpos] == 10)
                {
                    securitynum = 1;
                    room = 1;
                    charpos = 77;
                    for (int i = 0 ; i < cafgrid.length ; i++)
                    {
                        cafgrid [i].setIcon (null);
                        cafgrid [i].setBackground (new Color (239, 230, 175));

                        if (gridtrack [i] == 0 || gridtrack [i] == 22 || gridtrack [i] == 33)
                            cafgrid [i].setBackground (Color.black);
                        else if (gridtrack [i] == 7)
                        {
                            if (gridtrack [i - 1] == 6)
                                cafgrid [i].setIcon (createImageIcon ("Delegate1.png"));
                            else
                                cafgrid [i].setIcon (createImageIcon ("Delegate2.png"));
                        }
                        else if (gridtrack [i] == 50)
                        {
                            cafgrid [i].setIcon (createImageIcon ("Security" + securitynum + ".png"));
                            securitynum++;
                        }
                        else if (gridtrack [i] == 6)
                        {
                            cafgrid [i].setIcon (createImageIcon ("Bench" + benchnum + ".png"));
                            benchnum++;
                            if (benchnum > 2)
                                benchnum = 1;
                        }
                        else if (gridtrack [i] == 2 || gridtrack [i] == 3)
                            cafgrid [i].setIcon (createImageIcon ("leftEnter.png"));
                    }
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "r.png"));
                }
                else if (gridtrack3 [charpos] == 4)
                {
                    charpos = 126;
                    room = 4;
                    for (int i = 0 ; i < gridtrack.length ; i++)
                    {
                        cafgrid [i].setIcon (null);
                        cafgrid [i].setBackground (new Color (239, 230, 175));
                        if (gridtrack4 [i] == 5)
                            cafgrid [i].setIcon (createImageIcon ("upEnter.png"));
                        if (gridtrack4 [i] == 0)
                            cafgrid [i].setBackground (Color.black);
                        if (gridtrack4 [i] == 2)
                            cafgrid [i].setIcon (createImageIcon ("bottomEnter.png"));
                        if (gridtrack4 [i] == 7)
                        {
                            if (gridtrack4 [i + 15] == 60)
                                cafgrid [i].setIcon (createImageIcon ("Delegate8.png"));
                            else
                                cafgrid [i].setIcon (createImageIcon ("Delegate9.png"));
                        }
                        if (gridtrack4 [i] == 60)
                            cafgrid [i].setIcon (createImageIcon ("CCOM1.png"));
                        cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "b.png"));
                    }
                }
                else if ((Pdirec == 'f' && gridtrack3 [charpos + 15] == 0) || (Pdirec == 'b' && gridtrack3 [charpos - 15] == 0) || (Pdirec == 'l' && gridtrack3 [charpos + 1] == 0) || (Pdirec == 'r' && gridtrack3 [charpos - 1] == 0))
                    prompt.setText ("That's a wall...");
                else if ((Pdirec == 'f' && gridtrack3 [charpos + 15] == 50) || (Pdirec == 'b' && gridtrack3 [charpos - 15] == 50) || (Pdirec == 'l' && gridtrack3 [charpos + 1] == 50) || (Pdirec == 'r' && gridtrack3 [charpos - 1] == 50))
                    prompt.setText ("Such armour, much intimidation");
                else if ((Pdirec == 'f' && gridtrack3 [charpos + 15] == 7) || (Pdirec == 'b' && gridtrack3 [charpos - 15] == 7) || (Pdirec == 'l' && gridtrack3 [charpos + 1] == 7) || (Pdirec == 'r' && gridtrack3 [charpos - 1] == 7))
                {
                    if (gridtrack3 [charpos + 15] == 7)
                    {
                        cafgrid [charpos + 15].setIcon (null);
                        gridtrack3 [charpos + 15] = 1;
                    }
                    else if (gridtrack3 [charpos - 15] == 7)
                    {
                        cafgrid [charpos - 15].setIcon (null);
                        gridtrack3 [charpos - 15] = 1;
                    }
                    else if (gridtrack3 [charpos + 1] == 7)
                    {
                        cafgrid [charpos + 1].setIcon (null);
                        gridtrack3 [charpos + 1] = 1;
                    }
                    else if (gridtrack3 [charpos - 1] == 7)
                    {
                        cafgrid [charpos - 1].setIcon (null);
                        gridtrack3 [charpos - 1] = 1;
                    }
                    prompt.setText ("You found a Delegate! You used your MD powers to teleport them to safety.");
                    Dfound--;
                }
            }
            //*************************************************************************************************************************************************
            else if (room == 4)
            {
                if (gridtrack4 [charpos] == 2)
                {
                    securitynum = 2;
                    room = 3;
                    charpos = 32;
                    for (int i = 0 ; i < gridtrack.length ; i++)
                    {
                        cafgrid [i].setIcon (null);
                        cafgrid [i].setBackground (new Color (239, 230, 175));

                        if (gridtrack3 [i] == 0)
                            cafgrid [i].setBackground (Color.black);
                        if (gridtrack3 [i] == 50)
                            cafgrid [i].setIcon (createImageIcon ("Security4.png"));
                        if (gridtrack3 [i] == 4)
                            cafgrid [i].setIcon (createImageIcon ("upEnter.png"));
                        if (gridtrack3 [i] == 10)
                            cafgrid [i].setIcon (createImageIcon ("rightEnter.png"));
                        if (gridtrack3 [i] == 7)
                        {
                            if (gridtrack3 [i + 1] == 0)
                                cafgrid [i].setIcon (createImageIcon ("Delegate6.png"));
                            else
                                cafgrid [i].setIcon (createImageIcon ("Delegate7.png"));
                        }
                        cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "f.png"));
                    }
                }
                else if (gridtrack4 [charpos] == 5)
                {
                    charpos = 124;
                    room = 5;
                    for (int i = 0 ; i < gridtrack.length ; i++)
                    {
                        cafgrid [i].setIcon (null);
                        cafgrid [i].setBackground (new Color (239, 230, 175));
                        if (gridtrack5 [i] == 3 || gridtrack5 [i] == 5)
                            cafgrid [i].setIcon (createImageIcon ("bottomEnter.png"));
                        if (gridtrack5 [i] == 0)
                            cafgrid [i].setBackground (Color.black);
                        if (gridtrack5 [i] == 7)
                        {
                            if (gridtrack5 [i - 15] == 50)
                                cafgrid [i].setIcon (createImageIcon ("Delegate10.png"));
                            else if (gridtrack5 [i - 15] == 0)
                                cafgrid [i].setIcon (createImageIcon ("Delegate11.png"));
                            else
                                cafgrid [i].setIcon (createImageIcon ("Delegate12.png"));
                        }
                        if (gridtrack5 [i] == 60)
                            cafgrid [i].setIcon (createImageIcon ("CCOM1.png"));
                        if (gridtrack5 [i] == 50)
                        {
                            if (i - 15 < 0)
                                cafgrid [i].setIcon (createImageIcon ("Security3.png"));
                            else
                                cafgrid [i].setIcon (createImageIcon ("Security4.png"));
                        }
                        cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "b.png"));
                    }
                }
                else if ((Pdirec == 'f' && gridtrack4 [charpos + 15] == 0) || (Pdirec == 'b' && gridtrack4 [charpos - 15] == 0) || (Pdirec == 'l' && gridtrack4 [charpos + 1] == 0) || (Pdirec == 'r' && gridtrack4 [charpos - 1] == 0))
                    prompt.setText ("That's a wall...");
                else if ((Pdirec == 'f' && gridtrack4 [charpos + 15] == 60) || (Pdirec == 'b' && gridtrack4 [charpos - 15] == 60) || (Pdirec == 'l' && gridtrack4 [charpos + 1] == 60) || (Pdirec == 'r' && gridtrack4 [charpos - 1] == 60))
                    prompt.setText ("C-COM sure does have some godly oufits this year.");
                else if ((Pdirec == 'f' && gridtrack4 [charpos + 15] == 7) || (Pdirec == 'b' && gridtrack4 [charpos - 15] == 7) || (Pdirec == 'l' && gridtrack4 [charpos + 1] == 7) || (Pdirec == 'r' && gridtrack4 [charpos - 1] == 7))
                {
                    if (gridtrack4 [charpos + 15] == 7)
                    {
                        cafgrid [charpos + 15].setIcon (null);
                        gridtrack4 [charpos + 15] = 1;
                    }
                    else if (gridtrack4 [charpos - 15] == 7)
                    {
                        cafgrid [charpos - 15].setIcon (null);
                        gridtrack4 [charpos - 15] = 1;
                    }
                    else if (gridtrack4 [charpos + 1] == 7)
                    {
                        cafgrid [charpos + 1].setIcon (null);
                        gridtrack4 [charpos + 1] = 1;
                    }
                    else if (gridtrack4 [charpos - 1] == 7)
                    {
                        cafgrid [charpos - 1].setIcon (null);
                        gridtrack4 [charpos - 1] = 1;
                    }
                    prompt.setText ("You found a Delegate! You used your MD powers to teleport them to safety.");
                    Dfound--;
                }
            }
            //*************************************************************************************************************************************************
            else if (room == 5)
            {
                if (gridtrack5 [charpos] == 3)
                {
                    charpos = 22;
                    room = 4;
                    for (int i = 0 ; i < gridtrack.length ; i++)
                    {
                        cafgrid [i].setIcon (null);
                        cafgrid [i].setBackground (new Color (239, 230, 175));
                        if (gridtrack4 [i] == 5)
                            cafgrid [i].setIcon (createImageIcon ("upEnter.png"));
                        if (gridtrack4 [i] == 0)
                            cafgrid [i].setBackground (Color.black);
                        if (gridtrack4 [i] == 2)
                            cafgrid [i].setIcon (createImageIcon ("bottomEnter.png"));
                        if (gridtrack4 [i] == 7)
                        {
                            if (gridtrack4 [i + 15] == 60)
                                cafgrid [i].setIcon (createImageIcon ("Delegate8.png"));
                            else
                                cafgrid [i].setIcon (createImageIcon ("Delegate9.png"));
                        }
                        if (gridtrack4 [i] == 60)
                            cafgrid [i].setIcon (createImageIcon ("CCOM1.png"));
                        cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "f.png"));
                    }
                }
                else if (gridtrack5 [charpos] == 5)
                {
                    music = 1;
                    room = 2;
                    charpos = 148;
                    for (int i = 0 ; i < gridtrack.length ; i++)
                    {
                        cafgrid [i].setIcon (null);
                        cafgrid [i].setBackground (new Color (239, 230, 175));

                        if (gridtrack2 [i] == 8)
                        {
                            cafgrid [i].setIcon (null);
                            cafgrid [i].setBackground (new Color (63, 72, 204));
                        }
                        if (gridtrack2 [i] == 70)
                        {
                            cafgrid [i].setIcon (createImageIcon ("music" + music + ".png"));
                            music++;
                        }
                        if (gridtrack2 [i] == 50)
                            cafgrid [i].setIcon (createImageIcon ("Security2.png"));
                        if (gridtrack2 [i] == 10)
                            cafgrid [i].setIcon (createImageIcon ("bottomEnter.png"));
                        if (gridtrack2 [i] == 5)
                            cafgrid [i].setIcon (createImageIcon ("rightEnter.png"));
                        if (gridtrack2 [i] == 12)
                            cafgrid [i].setIcon (createImageIcon ("table.png"));
                        if (gridtrack2 [i] == 7)
                        {
                            if (i - 1 == -1)
                                cafgrid [i].setIcon (createImageIcon ("Delegate3.png"));
                            else if (gridtrack2 [i + 1] == 50)
                                cafgrid [i].setIcon (createImageIcon ("Delegate4.png"));
                            else
                                cafgrid [i].setIcon (createImageIcon ("Delegate5.png"));
                        }
                        if (gridtrack2 [i] == 60)
                            cafgrid [i].setIcon (createImageIcon ("CCOM1.png"));
                    }
                    cafgrid [60].setIcon (createImageIcon ("CCOM2.png"));
                    cafgrid [charpos].setIcon (createImageIcon ("char" + charnum + "l.png"));
                }
                else if ((Pdirec == 'f' && gridtrack5 [charpos + 15] == 0) || (Pdirec == 'b' && gridtrack5 [charpos - 15] == 0) || (Pdirec == 'l' && gridtrack5 [charpos + 1] == 0) || (Pdirec == 'r' && gridtrack5 [charpos - 1] == 0))
                    prompt.setText ("That's a wall...");
                else if ((Pdirec == 'f' && gridtrack5 [charpos + 15] == 60) || (Pdirec == 'b' && gridtrack5 [charpos - 15] == 60) || (Pdirec == 'l' && gridtrack5 [charpos + 1] == 60) || (Pdirec == 'r' && gridtrack5 [charpos - 1] == 60))
                    prompt.setText ("Those outfits are Loki sick.");
                else if ((Pdirec == 'f' && gridtrack5 [charpos + 15] == 50) || (Pdirec == 'b' && gridtrack5 [charpos - 15] == 50) || (Pdirec == 'l' && gridtrack5 [charpos + 1] == 50) || (Pdirec == 'r' && gridtrack5 [charpos - 1] == 50))
                    prompt.setText ("I feel pretty secure.");
                else if ((Pdirec == 'f' && gridtrack5 [charpos + 15] == 7) || (Pdirec == 'b' && gridtrack5 [charpos - 15] == 7) || (Pdirec == 'l' && gridtrack5 [charpos + 1] == 7) || (Pdirec == 'r' && gridtrack5 [charpos - 1] == 7))
                {
                    if (gridtrack5 [charpos + 15] == 7)
                    {
                        cafgrid [charpos + 15].setIcon (null);
                        gridtrack5 [charpos + 15] = 1;
                    }
                    else if (gridtrack5 [charpos - 15] == 7)
                    {
                        cafgrid [charpos - 15].setIcon (null);
                        gridtrack5 [charpos - 15] = 1;
                    }
                    else if (gridtrack5 [charpos + 1] == 7)
                    {
                        cafgrid [charpos + 1].setIcon (null);
                        gridtrack5 [charpos + 1] = 1;
                    }
                    else if (gridtrack5 [charpos - 1] == 7)
                    {
                        cafgrid [charpos - 1].setIcon (null);
                        gridtrack5 [charpos - 1] = 1;
                    }
                    prompt.setText ("You found a Delegate! You used your MD powers to teleport them to safety.");
                    Dfound--;
                }
            }
        }
    }
    protected static ImageIcon createImageIcon (String path)
    {
        java.net.URL imgURL = IBMC.class.getResource (path);
        if (imgURL != null)
        {
            return new ImageIcon (imgURL);
        }
        else
        {
            System.err.println ("Couldn't find file: " + path);
            return null;
        }
    }
}




