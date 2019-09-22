/**
 * 单例的双检锁实现
 */
public class SingletonDoubleCheck {

    //一定要用 volatile修饰
    private static volatile SingletonDoubleCheck singletonDoubleCheck = null;

    public static SingletonDoubleCheck getInstance(){
        if(singletonDoubleCheck == null){
            synchronized(SingletonDoubleCheck.class){
                if(singletonDoubleCheck == null){
                    singletonDoubleCheck = new SingletonDoubleCheck();
                }
            }
        }
        return singletonDoubleCheck;
    }
}
