import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Bot extends JFrame {

    private JTextArea Chatarea = new JTextArea();
    private JTextField chatbox = new JTextField();


    public Bot(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600 , 600);
        frame.setTitle("ChatBot");
        frame.add(Chatarea);
        frame.add(chatbox);
        //FOR TEXTAREA
        Chatarea.setSize(500 , 400);
        Chatarea.setLocation(2 , 2);
        //FOR TEXTFIELD
        chatbox.setSize(540 , 30);
        chatbox.setLocation(2 , 500);

        chatbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String gtext = chatbox.getText().toLowerCase();
                Chatarea.append("YOU ->" + gtext + "\n");
                chatbox.setText("");

                if(gtext.contains("hi")){
                    bot("Hello");
                }
                else{
                    int rand = (int) (Math.random()* 3 + 1);
                    if(rand == 1) {
                        bot("I DONT UNDERSTAND YOU");
                    } else if( rand == 2){
                        bot("I DONT UNDERSTAND YOUR MESSAGE");
                    } else if (rand == 3){
                        bot("PLEASE REPEAT AGAIN");
                    }

                }

            }
        });

    }
    private void bot(String string){
        Chatarea.append("BOT ->"  + string + "\n");
    }

    public static void main(String args[]){
        new Bot();
    }
}
