package abstractfactory_reflection;

/**
 * Created by guan on 9/19/16.
 */
public class Factory {

    public static ProductionA CreateProdA(String name)  {
        try {
            return (ProductionA) Class.forName(name).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ProductionB CreateProdB(String name){
        try {
            return (ProductionB) Class.forName(name).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
