
import classes.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;


public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        StackArray stack = new StackArray(4);
        QueueArray queue = new QueueArray(4);
        queue.put(3);
        queue.put(4);

        Class someClass = queue.getClass();
        System.out.println("Name of super class: " + someClass.getSuperclass().getName());


        Method[] methods = someClass.getMethods();
        for(Method method: methods){
            System.out.println("Method name " + method.getName());

            for (int j = 0 ; j<method.getAnnotations().length; j++){
                if (method.getAnnotations()[j].annotationType().getSimpleName().equals("CallMethod")){
                    System.out.println("Get result of annotation method : " +  method.invoke(queue));
                }
            }

            Parameter[] parameters = method.getParameters();
            for (Parameter parametr: parameters){
                System.out.println("Name of parametr: " + parametr.getName() + "Type :" + parametr.getType().getName());
            }
            System.out.println("Type of method " + Modifier.toString(method.getModifiers()));
        }
    }
}