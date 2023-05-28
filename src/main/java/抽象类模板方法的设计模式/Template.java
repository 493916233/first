package 抽象类模板方法的设计模式;

/**
 *
 */
 abstract class Template {
     public void time(){
         long state = System.currentTimeMillis();
         this.code();
         long end = System.currentTimeMillis();
         System.out.println("代码运行花费了时间为："+(end-state));
     }
     public abstract void code();
}

 