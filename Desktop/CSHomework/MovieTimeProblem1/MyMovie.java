public class MyMovie{
  public static void main(String args[]){
    System.out.println("Please ensure the following images are included in the directory this program is being run from:");
    System.out.println("ichigo.png");
    System.out.println("ichigo2.png");
    System.out.println("aizen1.png");
    System.out.println("aizen2.png");
    System.out.println("aizen3.png");
    System.out.println("aizen4.png");
    System.out.println("aizen5.png");
    System.out.println("aizen6.png");
    System.out.println("background.jpg");
    System.out.println("rukia1.png");
    System.out.println("rukia2.png");
    System.out.println("rukia3.png");
    System.out.println("rukia4.png");
    System.out.println("love.png");
    System.out.println("Now playing: Ichigo+Aizen Battle");

    Sprite aizen1 = new Sprite("aizen1.png");
    Sprite aizen2 = new Sprite("aizen2.png");
    Sprite aizen3 = new Sprite("aizen3.png");
    Sprite aizen4 = new Sprite("aizen4.png");
    Sprite aizen5 = new Sprite("aizen5.png");
    Sprite aizen6 = new Sprite("aizen6.png");
    Sprite ichigo = new Sprite("ichigo.png");
    Sprite ichigo2 = new Sprite("ichigo2.png");
    Sprite rukia1 = new Sprite("rukia1.png");
    Sprite rukia2 = new Sprite("rukia2.png");
    Sprite rukia3 = new Sprite("rukia3.png");
    Sprite rukia4 = new Sprite("rukia4.png");
    Sprite love = new Sprite("love.png");

    aizen1.setSize(37,79);
    aizen2.setSize(38,81);
    aizen3.setSize(55,65);
    aizen4.setSize(85,64);
    aizen5.setSize(37,79);
    aizen6.setSize(38,81);
    ichigo.setSize(37,76);
    ichigo2.setSize(37,76);
    rukia1.setSize(25,79);
    rukia2.setSize(87,85);
    rukia3.setSize(94,74);
    rukia4.setSize(70,75);
    love.setSize(50,50);

    Animation fight = new Animation(800,450);
    fight.setFrameRate(1);
    fight.setBackgroundImage("background.jpg");

    aizen1.setPosition(0,0);
    rukia1.setPosition((800-76),0);
    ichigo.setPosition(40,0);
    fight.addSprite(aizen1);
    fight.addSprite(rukia1);
    fight.addSprite(ichigo);
    fight.frameFinished();

    fight.removeSprite(aizen1);
    fight.removeSprite(rukia1);
    aizen2.setPosition(40,0);
    ichigo.setPosition(0,0);
    rukia2.setPosition((720),80);
    fight.addSprite(rukia2);
    fight.addSprite(aizen2);
    fight.frameFinished();

    fight.removeSprite(aizen2);
    fight.removeSprite(rukia2);
    fight.removeSprite(ichigo);
    aizen3.setPosition(45,0);
    rukia3.setPosition(670,75);
    fight.addSprite(rukia3);
    fight.addSprite(aizen3);
    fight.frameFinished();

    aizen3.setPosition(80,0);
    rukia3.setPosition(600,70);
    fight.frameFinished();

    aizen3.setPosition(125,25);
    fight.addSprite(aizen3);
    rukia3.setPosition(530,65);
    fight.frameFinished();

    fight.removeSprite(aizen3);
    aizen4.setPosition(250,50);
    rukia3.setPosition(460,55);
    fight.addSprite(aizen4);
    fight.frameFinished();

    fight.removeSprite(rukia3);
    aizen4.setPosition(270,50);
    fight.removeSprite(rukia3);
    fight.addSprite(rukia4);
    rukia4.setPosition(355,50);
    fight.frameFinished();

    fight.removeSprite(aizen4);
    fight.addSprite(aizen6);
    aizen6.setPosition(270,0);
    rukia4.setPosition(500,50);
    fight.frameFinished();

    fight.addSprite(ichigo2);
    ichigo2.setPosition(0,0);
    aizen6.setPosition(190,0);
    rukia4.setPosition(600,50);
    fight.frameFinished();

    ichigo2.setPosition(75,0);
    aizen6.setPosition(110,0);
    rukia4.setPosition(700,50);
    fight.frameFinished();

    fight.removeSprite(rukia4);
    fight.removeSprite(aizen6);
    fight.addSprite(aizen5);
    aizen5.setPosition(110,0);
    fight.frameFinished();

    fight.removeSprite(aizen5);
    fight.removeSprite(ichigo2);
    fight.addSprite(ichigo);
    fight.addSprite(aizen1);
    aizen1.setPosition(110,0);
    ichigo.setPosition(75,0);
    fight.frameFinished();

    fight.removeSprite(aizen1);
    fight.removeSprite(ichigo);
    fight.addSprite(ichigo2);
    fight.addSprite(aizen5);
    fight.addSprite(love);
    aizen5.setPosition(110,0);
    ichigo2.setPosition(75,0);
    love.setPosition(92,70);
    fight.frameFinished();

    fight.removeSprite(ichigo2);
    fight.addSprite(ichigo);
    ichigo.setPosition(0,0);
    aizen5.setPosition(40,0);
    love.setPosition(38,70);
    fight.frameFinished();

    fight.removeSprite(ichigo);
    fight.removeSprite(love);
    fight.removeSprite(aizen5);
    fight.frameFinished();




  }

}

