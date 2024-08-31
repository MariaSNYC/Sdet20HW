package org.example.e136;

public class E136AccessModifiers {
    private void priv(){
        System.out.println("This is Private Method");
    }

     void def(){
        System.out.println("This is Default Method");
    }

    protected void prot(){
        System.out.println("This is Protected Method");
    }

    public void pub(){
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        E136AccessModifiers call=new E136AccessModifiers();
        call.priv();
        call.def();
        call.prot();
        call.pub();

    }
}


