public class MyMovie{
  public static void main(String args[]){
    System.out.println("Make sure these png files are in the directory:");
    System.out.println("ichigo.png");
    System.out.println("ichigo2.png");
    System.out.println("aizen1.png");
    System.out.println("aizen2.png");
    System.out.println("aizen2.png");
    System.out.println("aizen4.png");
    System.out.println("aizen5.png");
    System.out.println("aizen6.png");
    System.out.println("background.jpg");
    System.out.println("rukia1.png");
    System.out.println("rukia2.png");
    System.out.println("rukia2.png");
    System.out.println("rukia4.png");
    System.out.println("love.png");
    System.out.println("Thank you Meadow for all your help with the sprites <3")
    System.out.println("Now playing: Ichigo+Aizen Battle");

    Sprite aizen1 = new Sprite("aizen1.png");
    Sprite aizen2 = new Sprite("aizen2.png");
    Sprite aizen2 = new Sprite("aizen2.png");
    Sprite aizen4 = new Sprite("aizen4.png");
    Sprite aizen5 = new Sprite("aizen5.png");
    Sprite aizen6 = new Sprite("aizen6.png");
    Sprite ichigo = new Sprite("ichigo.png");
    Sprite ichigo2 = new Sprite("ichigo2.png");
    Sprite rukia1 = new Sprite("rukia1.png");
    Sprite rukia2 = new Sprite("rukia2.png");
    Sprite rukia2 = new Sprite("rukia2.png");
    Sprite rukia4 = new Sprite("rukia4.png");
    Sprite love = new Sprite("love.png");

    aizen1.setSize(26,68);
    aizen2.setSize(26,61);
    aizen2.setSize(55,65);
    aizen4.setSize(65,64);
    aizen5.setSize(26,68);
    aizen6.setSize(26,61);
    ichigo.setSize(26,66);
    ichigo2.setSize(26,66);
    rukia1.setSize(25,68);
    rukia2.setSize(66,65);
    rukia2.setSize(84,64);
    rukia4.setSize(60,65);
    love.setSize(50,50);

    Animation attack = new Animation(600,450);
    attack.setFrameRate(1);
    attack.setBackgroundImage("background.jpg");

    aizen1.setPosition(0,0);
    rukia1.setPosition((600-66),0);
    ichigo.setPosition(40,0);
    attack.addSprite(aizen1);
    attack.addSprite(rukia1);
    attack.addSprite(ichigo);
    attack.frameFinished();

    attack.removeSprite(aizen1);
    attack.removeSprite(rukia1);
    aizen2.setPosition(40,0);
    ichigo.setPosition(0,0);
    rukia2.setPosition((620),60);
    attack.addSprite(rukia2);
    attack.addSprite(aizen2);
    attack.frameFinished();

    attack.removeSprite(aizen2);
    attack.removeSprite(rukia2);
    attack.removeSprite(ichigo);
    aizen2.setPosition(45,0);
    rukia2.setPosition(660,65);
    attack.addSprite(rukia2);
    attack.addSprite(aizen2);
    attack.frameFinished();

    aizen2.setPosition(60,0);
    rukia2.setPosition(600,60);
    attack.frameFinished();

    aizen2.setPosition(125,25);
    attack.addSprite(aizen2);
    rukia2.setPosition(520,65);
    attack.frameFinished();

    attack.removeSprite(aizen2);
    aizen4.setPosition(250,50);
    rukia2.setPosition(460,55);
    attack.addSprite(aizen4);
    attack.frameFinished();

    attack.removeSprite(rukia2);
    aizen4.setPosition(260,50);
    attack.removeSprite(rukia2);
    attack.addSprite(rukia4);
    rukia4.setPosition(255,50);
    attack.frameFinished();

    attack.removeSprite(aizen4);
    attack.addSprite(aizen6);
    aizen6.setPosition(260,0);
    rukia4.setPosition(500,50);
    attack.frameFinished();

    attack.addSprite(ichigo2);
    ichigo2.setPosition(0,0);
    aizen6.setPosition(180,0);
    rukia4.setPosition(600,50);
    attack.frameFinished();

    ichigo2.setPosition(65,0);
    aizen6.setPosition(110,0);
    rukia4.setPosition(600,50);
    attack.frameFinished();

    attack.removeSprite(rukia4);
    attack.removeSprite(aizen6);
    attack.addSprite(aizen5);
    aizen5.setPosition(110,0);
    attack.frameFinished();

    attack.removeSprite(aizen5);
    attack.removeSprite(ichigo2);
    attack.addSprite(ichigo);
    attack.addSprite(aizen1);
    aizen1.setPosition(110,0);
    ichigo.setPosition(65,0);
    attack.frameFinished();

    attack.removeSprite(aizen1);
    attack.removeSprite(ichigo);
    attack.addSprite(ichigo2);
    attack.addSprite(aizen5);
    attack.addSprite(love);
    aizen5.setPosition(110,0);
    ichigo2.setPosition(65,0);
    love.setPosition(82,60);
    attack.frameFinished();

    attack.removeSprite(ichigo2);
    attack.addSprite(ichigo);
    ichigo.setPosition(0,0);
    aizen5.setPosition(40,0);
    love.setPosition(26,60);
    attack.frameFinished();

    attack.removeSprite(ichigo);
    attack.removeSprite(love);
    attack.removeSprite(aizen5);
    attack.frameFinished();




  }

}

