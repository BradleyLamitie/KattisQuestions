//
// Bradley Lamitie
// Solved 7/26/2017
// Problem: Musical Notation
// Problem ID: musicalnotation
// Problem Link: https://open.kattis.com/problems/musicalnotation
// Difficulty: 2.1/10
// CPU Time Limit: 1 second
// Memory Limit: 1024 MB
// Current score: 18.0
//
package kattisQuestions;
import java.util.ArrayList;
import java.util.Scanner;
public class MusicalNotation {
    public static void main(String[] args){
        Scanner scan = null;        
    int y =0;
    
    int num;
    
            scan = new Scanner(System.in);
    //scan = new Scanner(System.in);
            num = scan.nextInt();
            String[] notes = new String[num];
            ArrayList<String> G = new ArrayList<String>();
            G.add("G: ");
            ArrayList<String> F = new ArrayList<String>();
            F.add("F: ");
            ArrayList<String> E = new ArrayList<String>();
            E.add("E: ");
            ArrayList<String> D = new ArrayList<String>();
            D.add("D: ");
            ArrayList<String> C = new ArrayList<String>();
            C.add("C: ");
            ArrayList<String> B = new ArrayList<String>();
            B.add("B: ");
            ArrayList<String> A = new ArrayList<String>();
            A.add("A: ");
            ArrayList<String> g = new ArrayList<String>();
            g.add("g: ");
            ArrayList<String> f = new ArrayList<String>();
            f.add("f: ");
            ArrayList<String> e = new ArrayList<String>();
            e.add("e: ");
            ArrayList<String> d = new ArrayList<String>();
            d.add("d: ");
            ArrayList<String> c = new ArrayList<String>();
            c.add("c: ");
            ArrayList<String> b = new ArrayList<String>();
            b.add("b: ");
            ArrayList<String> a = new ArrayList<String>();
            a.add("a: ");
           

            int note = num;
            while (y<note) {
                notes[y] = scan.next();
                //System.out.println(notes[y]);
                y=y+1;
            }
            if (scan != null) {
                scan.close();
            }
            
            
            for(int hum=0; hum<notes.length; hum++){
                int temp2;
                String temp1 = notes[hum].substring(0, 1);
                if(notes[hum].length()!=1){
                    temp2 = Integer.parseInt(notes[hum].substring(1, notes[hum].length()));
                }else{
                     temp2 = 1;
                }
            
                
                    if(temp1.equals("G")){
                        for(int mum = 0; mum<temp2; mum++){
                        G.add(addStar());
                        F.add(addDash());
                        E.add(addSpace());
                        D.add(addDash());
                        C.add(addSpace());
                        B.add(addDash());
                        A.add(addSpace());
                        g.add(addDash());
                        f.add(addSpace());
                        e.add(addDash());
                        d.add(addSpace());
                        c.add(addSpace());
                        b.add(addSpace());
                        a.add(addDash());
                        }
                    }else if(temp1.equals("F")){
                        for(int mum = 0; mum<temp2; mum++){
                        G.add(addSpace());
                        F.add(addStar());
                        E.add(addSpace());
                        D.add(addDash());
                        C.add(addSpace());
                        B.add(addDash());
                        A.add(addSpace());
                        g.add(addDash());
                        f.add(addSpace());
                        e.add(addDash());
                        d.add(addSpace());
                        c.add(addSpace());
                        b.add(addSpace());
                        a.add(addDash());
                        }
                    }else if(temp1.equals("E")){
                        for(int mum = 0; mum<temp2; mum++){
                        G.add(addSpace());
                        F.add(addDash());
                        E.add(addStar());
                        D.add(addDash());
                        C.add(addSpace());
                        B.add(addDash());
                        A.add(addSpace());
                        g.add(addDash());
                        f.add(addSpace());
                        e.add(addDash());
                        d.add(addSpace());
                        c.add(addSpace());
                        b.add(addSpace());
                        a.add(addDash());
                        }
                    }else if(temp1.equals("D")){
                        for(int mum = 0; mum<temp2; mum++){
                        G.add(addSpace());
                        F.add(addDash());
                        E.add(addSpace());
                        D.add(addStar());
                        C.add(addSpace());
                        B.add(addDash());
                        A.add(addSpace());
                        g.add(addDash());
                        f.add(addSpace());
                        e.add(addDash());
                        d.add(addSpace());
                        c.add(addSpace());
                        b.add(addSpace());
                        a.add(addDash());
                        }
                    }else if(temp1.equals("C")){
                        for(int mum = 0; mum<temp2; mum++){
                        G.add(addSpace());
                        F.add(addDash());
                        E.add(addSpace());
                        D.add(addDash());
                        C.add(addStar());
                        B.add(addDash());
                        A.add(addSpace());
                        g.add(addDash());
                        f.add(addSpace());
                        e.add(addDash());
                        d.add(addSpace());
                        c.add(addSpace());
                        b.add(addSpace());
                        a.add(addDash());
                        }
                    }else if(temp1.equals("B")){
                        for(int mum = 0; mum<temp2; mum++){
                        G.add(addSpace());
                        F.add(addDash());
                        E.add(addSpace());
                        D.add(addDash());
                        C.add(addSpace());
                        B.add(addStar());
                        A.add(addSpace());
                        g.add(addDash());
                        f.add(addSpace());
                        e.add(addDash());
                        d.add(addSpace());
                        c.add(addSpace());
                        b.add(addSpace());
                        a.add(addDash());
                        }
                    }else if(temp1.equals("A")){
                        for(int mum = 0; mum<temp2; mum++){
                        G.add(addSpace());
                        F.add(addDash());
                        E.add(addSpace());
                        D.add(addDash());
                        C.add(addSpace());
                        B.add(addDash());
                        A.add(addStar());
                        g.add(addDash());
                        f.add(addSpace());
                        e.add(addDash());
                        d.add(addSpace());
                        c.add(addSpace());
                        b.add(addSpace());
                        a.add(addDash());
                        }   }else if(temp1.equals("g")){
                            for(int mum = 0; mum<temp2; mum++){
                        G.add(addSpace());
                        F.add(addDash());
                        E.add(addSpace());
                        D.add(addDash());
                        C.add(addSpace());
                        B.add(addDash());
                        A.add(addSpace());
                        g.add(addStar());
                        f.add(addSpace());
                        e.add(addDash());
                        d.add(addSpace());
                        c.add(addSpace());
                        b.add(addSpace());
                        a.add(addDash());
                            }}else if(temp1.equals("f")){
                                for(int mum = 0; mum<temp2; mum++){
                        G.add(addSpace());
                        F.add(addDash());
                        E.add(addSpace());
                        D.add(addDash());
                        C.add(addSpace());
                        B.add(addDash());
                        A.add(addSpace());
                        g.add(addDash());
                        f.add(addStar());
                        e.add(addDash());
                        d.add(addSpace());
                        c.add(addSpace());
                        b.add(addSpace());
                        a.add(addDash());
                                }}else if(temp1.equals("e")){
                                    for(int mum = 0; mum<temp2; mum++){
                        G.add(addSpace());
                        F.add(addDash());
                        E.add(addSpace());
                        D.add(addDash());
                        C.add(addSpace());
                        B.add(addDash());
                        A.add(addSpace());
                        g.add(addDash());
                        f.add(addSpace());
                        e.add(addStar());
                        d.add(addSpace());
                        c.add(addSpace());
                        b.add(addSpace());
                        a.add(addDash());
                                    }}else if(temp1.equals("d")){
                                        for(int mum = 0; mum<temp2; mum++){
                        G.add(addSpace());
                        F.add(addDash());
                        E.add(addSpace());
                        D.add(addDash());
                        C.add(addSpace());
                        B.add(addDash());
                        A.add(addSpace());
                        g.add(addDash());
                        f.add(addSpace());
                        e.add(addDash());
                        d.add(addStar());
                        c.add(addSpace());
                        b.add(addSpace());
                        a.add(addDash());
                                        }}else if(temp1.equals("c")){
                                            for(int mum = 0; mum<temp2; mum++){
                        G.add(addSpace());
                        F.add(addDash());
                        E.add(addSpace());
                        D.add(addDash());
                        C.add(addSpace());
                        B.add(addDash());
                        A.add(addSpace());
                        g.add(addDash());
                        f.add(addSpace());
                        e.add(addDash());
                        d.add(addSpace());
                        c.add(addStar());
                        b.add(addSpace());
                        a.add(addDash());
                                            }}else if(temp1.equals("b")){
                                                for(int mum = 0; mum<temp2; mum++){
                        G.add(addSpace());
                        F.add(addDash());
                        E.add(addSpace());
                        D.add(addDash());
                        C.add(addSpace());
                        B.add(addDash());
                        A.add(addSpace());
                        g.add(addDash());
                        f.add(addSpace());
                        e.add(addDash());
                        d.add(addSpace());
                        c.add(addSpace());
                        b.add(addStar());
                        a.add(addDash());
                                                }       }else if(temp1.equals("a")){
                                                    for(int mum = 0; mum<temp2; mum++){
                        G.add(addSpace());
                        F.add(addDash());
                        E.add(addSpace());
                        D.add(addDash());
                        C.add(addSpace());
                        B.add(addDash());
                        A.add(addSpace());
                        g.add(addDash());
                        f.add(addSpace());
                        e.add(addDash());
                        d.add(addSpace());
                        c.add(addSpace());
                        b.add(addSpace());
                        a.add(addStar());
                                                    }}
                    if(hum <notes.length - 1){
                    G.add(addSpace());
                    F.add(addDash());
                    E.add(addSpace());
                    D.add(addDash());
                    C.add(addSpace());
                    B.add(addDash());
                    A.add(addSpace());
                    g.add(addDash());
                    f.add(addSpace());
                    e.add(addDash());
                    d.add(addSpace());
                    c.add(addSpace());
                    b.add(addSpace());
                    a.add(addDash());
                    }
                }
                for(int bum = 0; bum<G.size();bum++){
                    System.out.print(G.get(bum));
                }               System.out.println();

                for(int bum = 0; bum<F.size();bum++){
                    System.out.print(F.get(bum));
                }               System.out.println();

                for(int bum = 0; bum<E.size();bum++){
                    System.out.print(E.get(bum));
                }               System.out.println();

                for(int bum = 0; bum<D.size();bum++){
                    System.out.print(D.get(bum));
                }               System.out.println();

                for(int bum = 0; bum<C.size();bum++){
                    System.out.print(C.get(bum));
                }               System.out.println();

                for(int bum = 0; bum<B.size();bum++){
                    System.out.print(B.get(bum));
                }               System.out.println();

                for(int bum = 0; bum<A.size();bum++){
                    System.out.print(A.get(bum));
                }               System.out.println();

                for(int bum = 0; bum<g.size();bum++){
                    System.out.print(g.get(bum));
                }               System.out.println();

                for(int bum = 0; bum<f.size();bum++){
                    System.out.print(f.get(bum));
                }               System.out.println();

                for(int bum = 0; bum<e.size();bum++){
                    System.out.print(e.get(bum));
                }               System.out.println();

                for(int bum = 0; bum<d.size();bum++){
                    System.out.print(d.get(bum));
                }
                System.out.println();

                for(int bum = 0; bum<c.size();bum++){
                    System.out.print(c.get(bum));
                }
                System.out.println();

                for(int bum = 0; bum<b.size();bum++){
                    System.out.print(b.get(bum));
                }
                System.out.println();

                for(int bum = 0; bum<a.size();bum++){
                    System.out.print(a.get(bum));
                }
                System.out.println();

        
           
     }
     

public static String addSpace() {
    return " ";
  
}
public static String addDash() {
    return "-";
  
}
public static String addStar() {
    return "*";
  
}
}