package builder;

/**
 * Created by guan on 9/22/16.
 * 产品类：这个产品很复杂，包括很多方面，每一方面都要做，不能有遗漏或者错误
 */
public class Product {

    String attribute1;
    String attribute2;
    String attribute3;
    String attribute4;
    String attribute5;

    public void showProduct()
    {
        System.out.println(attribute1+"\t"+attribute2+"\t"+attribute3+"\t"+attribute4+"\t"+attribute5);
    }

}
