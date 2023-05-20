import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simple_game {
    JFrame main_window; JLabel game_title; JPanel game_panel; JPanel start_game_panel;
    JButton Start_button; JPanel game_screen_panel; JPanel choice_panel; JTextArea game_text;
    TitleScreen Titlescreen = new TitleScreen();
    Choice choice = new Choice();
    String whereareyou;
    Lose you_lose = new Lose();
    JButton Choice1; JButton Choice2; JButton Choice3;

    Container con;

    Font font = new Font("DialogInput", Font.BOLD, 25);
    Font sb_font = new Font("DialogInput ", Font.PLAIN, 33);
    Font gs_font = new Font("DialogInput", Font.PLAIN, 30);
    Font gs_font2 = new Font("DialogInput", Font.PLAIN, 25);
    Font choice_font = new Font("DialogInput", Font.PLAIN, 20);
    Font choice_font_2 = new Font("DialogInput", Font.PLAIN, 15);

    public static void main(String[] args) {
        new simple_game();
    }

    public simple_game() {

        main_window = new JFrame();
        main_window.setSize(800, 600);
        main_window.setBackground(Color.black);
        main_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_window.setTitle("Adventure text game");
        main_window.setResizable(false);
        main_window.setLayout(null);
        main_window.getContentPane().setBackground(Color.black);
        ImageIcon image = new ImageIcon("icon.jpg");
        main_window.setIconImage(image.getImage());
        con = main_window.getContentPane();

        game_panel = new JPanel();
        game_panel.setBounds(39, 100, 720, 150);
        game_title = new JLabel(" Przygody morskiego wilka:"+" Piraci kontra tubylcy ");
        game_title.setForeground(Color.white);
        game_panel.setBackground(Color.black);
        game_panel.add(game_title);
        con.add(game_panel);
        game_title.setFont(font);


        start_game_panel = new JPanel();
        start_game_panel.setBounds(250, 350, 300, 100);
        start_game_panel.setBackground(Color.black);
        con.add(start_game_panel);

        Start_button = new JButton("Rozpocznij");
        Start_button.setBackground(Color.black);
        Start_button.setForeground(Color.white);
        Start_button.setFont(sb_font);
        Start_button.addActionListener(Titlescreen);
        start_game_panel.add(Start_button);


        main_window.setVisible(true);
    }

    public void Game_screen() {
        start_game_panel.setVisible(false);
        game_panel.setVisible(false);
        whereareyou = "game0";
        game_screen_panel = new JPanel();
        game_text = new JTextArea(" Twoja przygoda zaczyna się tutaj... ");
        game_text.setBackground(Color.black);
        game_text.setForeground(Color.white);
        game_text.setBounds(0, 100, 800, 450);
        game_text.setVisible(true);
        game_text.setEditable(false);
        game_text.setLineWrap(true);
        game_text.setFont(gs_font);


        game_screen_panel.setBounds(0, 0, 776, 332);
        game_screen_panel.setBackground(Color.black);
        game_screen_panel.setForeground(Color.white);
        game_screen_panel.add(game_text);
        con.add(game_screen_panel);

        choice_panel = new JPanel();
        choice_panel.setBounds(5, 345, 776, 209);
        choice_panel.setBackground(Color.black);
        choice_panel.setForeground(Color.white);
        choice_panel.setLayout(new GridLayout(3, 1));
        con.add(choice_panel);

        Choice1 = new JButton("Kontynuuj");
        Choice1.setBackground(Color.black);
        Choice1.setForeground(Color.white);
        Choice1.setVisible(true);
        Choice1.setFont(choice_font);
        Choice1.addActionListener(choice);
        Choice1.setActionCommand("1");
        choice_panel.add(Choice1);

        Choice2 = new JButton("");
        Choice2.setBackground(Color.black);
        Choice2.setForeground(Color.white);
        Choice2.setVisible(true);
        Choice2.setFont(choice_font);
        Choice2.addActionListener(choice);
        Choice2.setActionCommand("2");
        choice_panel.add(Choice2);

        Choice3 = new JButton(" ");
        Choice3.setBackground(Color.black);
        Choice3.setForeground(Color.white);
        Choice3.addActionListener(choice);
        Choice3.setActionCommand("3");
        Choice3.setVisible(true);
        Choice3.setFont(choice_font);
        choice_panel.add(Choice3);


    }

    public void Game() {
        whereareyou = "game1";
        Choice1.setFont(choice_font_2);
        Choice2.setFont(choice_font_2);
        Choice3.setFont(choice_font_2);
        game_text.setText("  \n Budzisz się na wybrzeżu, twoje ubrania są \n całe we krwi ale zostałeś opatrzony," +
                "nagle\n słyszysz szelest, odwracasz się i widzisz\n mężczyznę w średnim  wieku, który mówi\n Ci że, potrzebuje wydostać się z wypsy.");
        Choice1.setText("Wstajesz, wchodzisz na tratwę i wiosłujesz ile sił w rękach.");
        Choice2.setText("Odmawiasz pomocy");
        Choice3.setText("Chwytasz leżący koło ciebie nóż i atakujesz nieznajomego");
    }

    public void Game2() {
        whereareyou = "game2";
        game_text.setFont(gs_font2);
        game_text.setText("\n W trakcie ucieczki natrafiasz na statek piracki, \n zostajesz wtrącony w niewole." +
                " \n Budzisz się w małej  metalowej klatce,\n Viktor (tak ma na imię szef tego oddziału piratów) \n uderza Cię w twarz." +
                " Oszołomiony błagasz o życie i \n prosisz żeby Cię wypuścili.\n Viktor postanawia dać Ci szansę na udział w grze.");
        Choice1.setText("Grasz.");
        Choice2.setText("Odmawiasz.");
        Choice3.setText("");

    }

    public void Game3() {
        whereareyou = "game3";
        game_text.setText("\n Dostajesz jedną kulę i pistolet masz zabić \n człowieka, "+"który oszukał piratów na 2 miliony pesos,  jest ich 3 ");
        Choice1.setText("Strzelasz do starszej kobiety ubranej w drogocenną biżuterię");
        Choice2.setText("Strzelasz do starszego mężczyzny, wygląda zwyczajnie");
        Choice3.setText("Strzelasz do młodego mężczyzny który ma przy sobie plecak");

    }

    public void Game4() {
        whereareyou = "game4";
        game_text.setText("\n Wybrałeś dobrą osobę, zostałeś uwolniony na \n swoją tratwę, uciekasz dalej." +
                " Udało Ci się wydostać \n z wyspy, cieszysz się wolnością ale\n odczuwasz wielkie poczucie winy \n" +
                " Natrafiasz na zniszczoną wioskę tubylców \n Wódz plemienia Wożihadzi uważa że jesteś piratem  ");
        Choice1.setText("Pokornie błagasz o wybaczenie i liczysz, że Ci wybaczą");
        Choice2.setText("Brniesz dalej w te kłamstwo majac nadzieję, że się nie zorientują");
        Choice3.setText("");

    }

    public void Game5() {
        whereareyou = "game5";
        game_text.setText("\n Tubylcy w zammian za przebaczenie mówią Ci, że masz\n im pomóc w zwalczeniu piratów.\n " +
                "Pozwalają ci odpocząć, po tygodniu wioska wygląda\n już nieco lepiej, wszyscy doszli do siebie więc \n nadzszedł czas rzucić wyzwanie piratom. ");
        Choice1.setText("Proponujesz zwiad zanim zaatakujecie główną bazę wroga.");
        Choice2.setText("Proponujesz frontalny atak późno w nocy następnego dnia.");
        Choice3.setText("Proponujesz zebrać się jak najszybciej i tego samego dnia wyruszyc by stawić im czoła\n");

    }
    public void GameEnding1() {
        whereareyou = "gameending1";
        game_text.setText("\n Piraci zauważyli waszych zwiadowców przez co\n mieli czas na ucieczkę.\n" +
                " Tubylcy pomyśleli, że to twoja wina i za karę \n skazali  cię na egzekucję (UMIERASZ)" +
                "\n");


    }
    public void GameEnding2() {
        whereareyou = "gameending2";
        game_text.setText("\n Piraci byli przygotowani na tak łatwą taktykę \n więc zastawili wcześniej pułapki,\n wszyscy zostali straceni.\n (UMIERASZ)" +
                "\n");


    }
    public void GameEnding3() {
        whereareyou = "gameending3";
        game_text.setText("\n Piraci nie sądzili, że postąpicie w tak głupi \n sposób przez co nie byli przygotowani na wasz atak,\n zwycięska bitwa trwała niespełna godzinę a\n straty były niewielkie. " +
                " \n Zostałeś honorowym gościem tubylców i mianowany\n ich królem, tylko od ciebie zależy czy\n przyjmiesz koronę. (PRZEŻYŁEŚ)\n " +
                "\n");


    }

    public void youlose() {
        whereareyou = "lose";
        game_text.setText("      Przegrales, spróbuj ponownie  ");
        Choice1.setText("1.Uruchom gre jeszcze raz");
        Choice1.setActionCommand("1");
        Choice2.setText("");
        Choice3.setText("");
    }

    public class TitleScreen implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Game_screen();
        }
    }



    public class Lose implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            youlose();
        }
    }

    public class Choice implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String which_choice = e.getActionCommand();

            switch (whereareyou){
                case"game0":
                    switch (which_choice){
                        case "1" : Game(); break;
                        case "2" : break;
                        case "3" : break;
                    }
                    break;
                case"game1":
                    switch (which_choice){
                        case "1" : Game2(); break;
                        case "2" : youlose();
                        case "3" : youlose();
                    }
                    break;
                case"game2":
                    switch (which_choice){
                        case "1" : Game3(); break;
                        case "2" : youlose();
                        case "3" : break;
                    }
                    break;
                case "game3":
                    switch (which_choice){
                        case "1" : youlose(); break;
                        case "2" : youlose(); break;
                        case "3" : Game4(); break;
                    }
                    break;
                case"game4":
                    switch (which_choice){
                        case "1" : Game5(); break;
                        case "2" : youlose();
                        case "3" : break;
                    }
                    break;
                case"game5":
                    switch (which_choice){
                        case "1" : GameEnding1(); break;
                        case "2" :  GameEnding2(); break;
                        case "3" :  GameEnding3(); break;
                    }
                    break;
                case"lose":
                    switch (which_choice){
                        case "1" : Game(); break;
                        case "2" : break;
                        case "3" : break;
                    }
                    break;


            }
        }
    }
}