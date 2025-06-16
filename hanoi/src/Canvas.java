import javax.swing.*;
import java.awt.*;
import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;

public class Canvas extends JPanel{

    //tablica z kolorami
    final Color[] DiSC_COLOR = {

        new Color(0,255,0),
        new Color(0,0,255),
        new Color(255,0,0),
        new Color(255,255,0),
        new Color(255,0,255),
        new Color(0,255,255),
        new Color(255,165,0),
        new Color(128,0,128),



    };


    Graphics2D g2d;
    Timer t;
    int discs_amount = 5;
    int speed = 500;
    int step = 1;
    boolean is_running = false;
    Stack<Integer>[] pillars;

    public Canvas(){

        this.setBackground(new Color(255,255,255));
        this.reset();

    }

    public void reset(){

        this.t = new Timer();
        this.step = 1;
        this.pillars = new Stack[3];
        this.pillars[0] = new Stack<>();
        this.pillars[1] = new Stack<>();
        this.pillars[2] = new Stack<>();
        for(int i = 0; i < this.discs_amount; i++){
            pillars[0].push(i);
        }



    }

    @Override
    protected void printComponent(Graphics g) {
        super.printComponent(g);
        this.g2d = (Graphics2D) g;
        this.drawDiscs();
        this.drawPillars();

    }


        private void drawPillars(){
            int w = this.getWidth();
            int h = this.getHeight();

            this.g2d.setPaint(new Color(71, 33, 33));
            this.g2d.fillRect(this.getPillPosition(0), 0, w/100, h-1);
            this.g2d.fillRect(this.getPillPosition(1), 0, w/100, h-1);
            this.g2d.fillRect(this.getPillPosition(2), 0, w/100, h-1);



        }

        private int getPillPosition(int n) {

            int w = this.getWidth();

            return switch (n){

                case 0 -> (w/6) - (w/200);
                case 1 -> (w/2) - (w/200);
                case 2 -> w- (w/6) - (w/200);
                default -> 0;

            };


        }


        private void drawDiscs(){

            this.drawPillarDisc(0);
            this.drawPillarDisc(1);
            this.drawPillarDisc(2);

        }

        public void drawPillarDisc(int n){

        int w = this.getWidth();
        int h = this.getHeight();

        for(int i=0; i <= pillars[n].size(); i++ ){
            int disc_id = pillars[n].get(i);
            int pillar_position = this.getPillPosition(n);

            //wyliczanie pozycji i szerokości dysku
            int disc_width = (w/50) + (this.discs_amount +1 -(w/50)+(disc_id+1));
            int disc_x = pillar_position + (w/200) - (disc_width/2);
            int disc_y = h - (w/50) * (i+1)-1;

            //rysowanie dysku
            this.g2d.setPaint(DiSC_COLOR[disc_id %8]);
            this.g2d.fillRect(disc_x, disc_y, disc_width, w/50);
            this.g2d.setPaint(Color.BLACK);
            this.g2d.drawRect(disc_x, disc_y, disc_width, w/50);



        }




        }

        public void runHanoi(){
            this.t = new Timer();
            this.is_running = true;
            this.t.schedule(new TimerTask() {
                @Override
                public void run() {
                    stepHanoi();
                    runHanoi();
                }
            },this.speed);

        }

        public void stopHanoi(){

            if (is_running){

                this.is_running = false;
                this.t.cancel();
                this.t.purge();
                this.repaint();


            }

        }

        public void stepHanoi() {

            if (step > Math.pow(2, this.discs_amount) - 1) {
                this.stopHanoi();
                return;

            }

            int p1 = -1, p2 = -1, p3 = -1;
            if(!pillars[0].isEmpty()) p1 = pillars[0].peek();
            if(!pillars[1].isEmpty()) p2 = pillars[1].peek();
            if(!pillars[2].isEmpty()) p3 = pillars[2].peek();

            //Dla parzystej liczby dyskow zmienia sie kolejnosc ruchow

            if (this.discs_amount % 2 == 0) {
                if (step % 3 == 1) {
                    if(p1 > p2) pillars[1].push(pillars[0].pop());
                    else pillars[0].push(pillars[1].pop());
                }
                else if (step % 3 == 2) {
                    if(p1 > p3) pillars[2].push(pillars[0].pop());
                    else pillars[0].push(pillars[2].pop());
                }
                else if(step % 3 == 0) {
                    if(p3 > p2) pillars[1].push(pillars[2].pop());
                    else pillars[2].push(pillars[1].pop());
                }
            } else {
                if(step % 3 == 1) {
                    if(p1 > p3) pillars[2].push(pillars[0].pop());
                    else pillars[0].push(pillars[2].pop());
                }
                else if (step % 3 == 2) {
                    if(p1 > p2) pillars[1].push(pillars[0].pop());
                    else pillars[0].push(pillars[1].pop());
                }
                else if(step % 3 == 0) {
                    if(p2 > p3) pillars[2].push(pillars[1].pop());
                    else pillars[1].push(pillars[2].pop());
                }
            }

            this.step++;
            this.repaint();


        }

        public void setSpeed(int speed){
            this.speed = speed;



        }

        public void setDiscsAmount(int discs_amount){

            this.discs_amount = discs_amount;
            this.reset();
            this.repaint();

        }


}
