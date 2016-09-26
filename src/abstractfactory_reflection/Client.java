package abstractfactory_reflection;



/**
 * Created by guan on 9/19/16.
 */
public class Client {

    public static void main(String[] args)
    {
        String targetProd1=ProductionA1.class.getName();
        String targetProd2=ProductionB2.class.getName();

        Production prodA1=Factory.CreateProdA(targetProd1);
        Production prodB2=Factory.CreateProdB(targetProd2);

        prodA1.showProduct();
        prodB2.showProduct();

    }
}
