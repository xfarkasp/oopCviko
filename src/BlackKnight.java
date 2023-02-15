public class BlackKnight extends Knight{
    @Override
    void attack(Ogre ogre) {
        super.attack(ogre);
        //ogre.energy = ogre.energy - 25;
        ogre.energy = ogre.energy - (int)Math.random();
    }
}
