package lab7;


import java.util.Stack;

public class TestLab7 {

    public static Stack<Integer> deck1;
    public static Stack<Integer> deck2;

    public static void main(String[] args){
        deck1 = new Stack<Integer>();
        deck2 = new Stack<Integer>();
        int a1,a2,maxStep = 106;
        for(int i=0;i<5;++i){
            a1 = ((int)(Math.random()*9));
            a2 = ((int)(Math.random()*9));
            deck1.push(a1);
            deck2.push(a2);
        }
        System.out.println(deck1);
        System.out.println(deck2);
        int i=0;
        for(i=0;i<maxStep && !deck1.isEmpty() && !deck2.isEmpty();++i){
            a1 = deck1.pop();
            a2 = deck2.pop();
            if((a1==0&&a2==9)||(a1>a2&&(a1!=0&&a2!=9))){
                deck1.push(a1);
                deck1.push(a2);
            }else if(a1<a2 || (a1==9&&a2==0)){
                deck2.push(a1);
                deck2.push(a2);
            }
        }
        if(maxStep==i){
            System.out.println("Botva");
        }else if(deck2.isEmpty()){
            System.out.println("First " + i + " steps");
        }else if(deck1.isEmpty()){
            System.out.println("Second " + i + " steps");
        }
    }
}
