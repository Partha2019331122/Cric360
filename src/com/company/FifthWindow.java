package com.company;

import java.awt.*;
import javax.swing.*;

public class FifthWindow extends JFrame{

    private Container c;
    private Font f,f1;
    private JTextArea ta1;
    private JScrollPane js;
    private JLabel j1;
    private ImageIcon icon1;

    FifthWindow()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(20,20,900,730);
        setTitle("Cric360");

        init();
    }
    public void init() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.black);
        icon1 = new ImageIcon(getClass().getResource("cricket.png"));
        this.setIconImage(icon1.getImage());

        f=new Font("Arial",Font.BOLD,18);
        f1=new Font("Arial",Font.BOLD+Font.ITALIC,25);

        j1=new JLabel("Basic Rules Of Cricket");
        j1.setBounds(300,3,600,60);
        j1.setFont(f1);
        j1.setForeground(Color.BLUE);
        c.add(j1);

        ta1=new JTextArea(" \b RULES: \b \n" +
                "\n" +
                " 1. Cricket is played between two teams each made up of eleven players. (Sometime in junior competitions you will find 8 player teams).\n\n" +
                " 2. Games comprise of at least one innings where each team will take turns in batting and fielding/bowling.\n\n" +
                " 3. The fielding team will have a bowler bowl the ball to the batsman who tries to hit the ball with their bat.\n\n" +
                " 4. The fielding team tries to get the batsmen out by…\n" +
                "               i. Hitting the wickets with the ball when bowling\n" +
                "               ii. Catching a batsman’s shot on the full\n" +
                "               iii. Hitting the batsman’s leg in front of the wicket (LBW)\n" +
                "               iv. Or hitting the wickets before the batsmen can run to the other end of the pitch\n\n" +
                " 5. The batmen try to score as many runs as possible before getting out by…\n" +
                "               i. Hitting the ball and running between the wickets and making it to the other end before the fielders can hit the \n" +
                "                  wickets with the ball. Each time you run one full length of the pitch it equals 1 run.\n" +
                "               ii. Hitting the ball to the boundary along the ground is 4 runs.\n" +
                "               iii. Hitting the ball over the boundary on the full equals 6 runs.\n\n" +
                " 6. The fielding team must get 10 batsmen out before they can change over and start batting.\n\n" +
                " 7. The aim of the game is to score as many runs as possible before the fielding team takes 10 wickets. The team with the most runs wins.\n\n" +
                " 8.1. Fitness for play\n\n" +
                " 8.2. It is solely for the umpires together to decide whether\n\n" +
                " 8.3. either conditions of ground, weather or light or exceptional\n\n" +
                " 8.4. circumstances mean that it would be dangerous or\n\n" +
                " 8.5. unreasonable for play to take place.\n\n" +
                " 8.6. Conditions shall not be regarded as either dangerous or\n\n" +
                " 8.7. unreasonable merely because they are not ideal.\n\n" +
                " 8.8. The fact that the grass and the ball are wet does not warrant the\n\n" +
                " 8.9. ground conditions being regarded as unreasonable or dangerous.\n\n" +
                "2.7.2 Conditions shall be regarded as dangerous if there is actual and\n\n" +
                "foreseeable risk to the safety of any player or umpire.\n\n" +
                "2.7.3 Conditions shall be regarded as unreasonable if, although posing\n\n" +
                "no risk to safety, it would not be sensible for play to proceed.\n\n" +
                "2.7.4 If the umpires consider the ground is so wet or slippery as to\n" +
                "deprive the bowler of a reasonable foothold, the fielders of\n" +
                "the power of free movement, or the batsmen of the ability\n" +
                "to play their strokes or to run between the wickets, then\n" +
                "these conditions shall be regarded as so bad that it would be\n" +
                "dangerous and unreasonable for play to take place.\n" +
                "2.8 Suspension of play in dangerous or unreasonable circumstances\n" +
                "2.8.1 All references to ground include the pitch. See clause 6.1\n" +
                "(Area of pitch).\n" +
                "2.8.2 If at any time the umpires together agree that the conditions\n" +
                "of ground, weather or light, or any other circumstances are\n" +
                "dangerous or unreasonable, they shall immediately suspend\n" +
                "play, or not allow play to start or to recommence. The decision\n" +
                "as to whether conditions are so bad as to warrant such action is\n" +
                "one for the umpires alone to make, following consultation with\n" +
                "the ICC Match Referee.\n" +
                "2.8.3 If circumstances are warranted, the umpires shall stop play and\n" +
                "instruct the Ground Authority to take whatever action they can\n" +
                "and use whatever equipment is necessary to remove as much\n" +
                "dew as possible from the outfield when conditions become\n" +
                "unreasonable or dangerous. The umpires may also instruct\n" +
                "the ground staff to take such action during scheduled and\n" +
                "unscheduled breaks in play.\n" +
                "2.8.4 The umpires shall disregard any shadow on the pitch from\n" +
                "the stadium or from any permanent object on the ground.\n" +
                "2.8.5 Light Meters\n" +
                " It is the responsibility of the ICC to supply light meters to\n" +
                "the match officials to be used in accordance with these\n" +
                "playing conditions.\n" +
                "2.8.5.1 All light meters shall be uniformly calibrated.\n" +
                "2.8.5.2 The umpires shall be entitled to use light meter\n" +
                "readings as a guideline for determining whether the\n" +
                "light is fit for play in accordance with the criteria set\n" +
                "out in clause 2.8.2 above." +
                "1.2.8 The ICC Match Referee should ordinarily approve a Concussion \n" +
                "Replacement Request if the replacement is a like-for-like player \n" +
                "whose inclusion will not excessively advantage his team for the \n" +
                "remainder of the match.\n" +
                "1.2.8.1 In assessing whether the nominated Concussion \n" +
                "Replacement should be considered a like-for-like \n" +
                "player, the ICC Match Referee should consider the \n" +
                "likely role the concussed player would have played \n" +
                "during the remainder of the match, and the normal \n" +
                "role that would be performed by the nominated \n" +
                "Concussion Replacement.\n" +
                "1.2.8.2 If the ICC Match Referee believes that the inclusion \n" +
                "of the nominated Concussion Replacement, when \n" +
                "performing their normal role, would excessively \n" +
                "advantage their team, the Match Referee may impose \n" +
                "such conditions upon the identity and involvement \n" +
                "of the Concussion Replacement as he/she sees fit,\n" +
                "in line with the overriding objective of facilitating a \n" +
                "like-for-like replacement for the concussed player.\n" +
                "1.2.8.3 The ICC Match Referee may, in reviewing a Concussion \n" +
                "Replacement Request made in accordance with clause \n" +
                "1.2.7.3, request any such further information as may be \n" +
                "required in order to make the determination required \n" +
                "under clauses 1.2.8.1 and 1.2.8.2.\n" +
                "1.2.9 The decision of the ICC Match Referee in relation to any \n" +
                "Concussion Replacement Request shall be final and neither\n" +
                "team shall have any right of appeal.\n" +
                "1.2.10 Once the Concussion Replacement has been \n" +
                "approved by the ICC Match Referee, the replaced \n" +
                "player shall play no further part in the match.\n" +
                "1.2.11 Both the Concussion Replacement and the replaced \n" +
                "player shall be considered to have played in the \n" +
                "match for records and statistical purposes.\n" +
                "1.3 Captain\n" +
                "1.3.1 If at any time the captain is not available, a deputy shall act for him.\n" +
                "1.3.2 If a captain is not available to nominate the players, then any \n" +
                "person associated with that team may act as his deputy to do \n" +
                "so. See clause 1.2.\n" +
                "1.3.3 At any time after the nomination of the players, only a \n" +
                "nominated player can act as deputy in discharging the duties \n" +
                "and responsibilities of the captain as stated in these Playing \n" +
                "Conditions, including at the toss. See clause 13.4(The toss)");
        ta1.setFont(f);
        ta1.setLineWrap(true);
        ta1.setWrapStyleWord(true);
        ta1.setBackground(Color.DARK_GRAY);
        ta1.setForeground(Color.yellow);

        js=new JScrollPane(ta1);
        js.setBounds(10,60,878,620);
        js.setBackground(Color.black);

        c.add(js);

    }
    public static void main(String[] args)  {
        FifthWindow frame=new FifthWindow();
        frame.setVisible(true);
    }
}