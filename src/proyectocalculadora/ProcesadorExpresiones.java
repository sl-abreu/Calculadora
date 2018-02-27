/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocalculadora;

/**
 *
 * <pre>
 * Contenedor de métodos estáticos auxiliares en el
 * procesamiento de expresiones matemáticas de la
 * calculadora.
 * 
 * Al ser de tipo estático, pueden ser invocadas sin
 * necesidad de instanciar la clase.
 * </pre>
 * @author SLGA
 */
public class ProcesadorExpresiones {
    /**
     * 
     * @param op Caracter a analizar.
     * @return <ul>
     *  <li> 1: si op es '+' o '-'
     *  <li> 2: si op es '*' o '/'
     *  <li> 3: si op es '^'
     *  <li> -1: si op es cualquier otro caracter.
     *  </ul>
     */
    public static int prioridad(char op){
        int prio;
        /*
        Se utiliza un switch (sugerido por NetBeans en lugar de if´s anidados),
        para asignar la prioridad de operadores.
        */
        switch (op) {
            case '+':
            case '-':
                prio=1;
                break;
            case '*':
            case '/':
                prio=2;
                break;
            case '^':
                prio=3;
                break;
            default:
                prio=-1;
                break;
        }
        return prio;
    }
    /**
     * 
     * @param op    Caracter a analizar.
     * @return <ul>
     *  <li> True: si op es alguno de los siguientes caracteres: <ul>
     *      <li> +
     *      <li> -
     *      <li> *
     *      <li> /
     *      <li> ^
     *      </ul>
     *  <li> False: si es cualquier otro caracter.
     *  </ul>
     */
    public static boolean esOperador(char op){
        return op=='+' || op=='-' || op=='*' || op=='/' || op=='^';
    }
    /**
     * 
     * @param exp   Expresión matemática a evaluar
     * @return <ul>
     *  <li> False: si la expresión contiene uno de los siguientes errores: <ul>
     *      <li> Operador seguido de operador (con excepción de un signo negativo)
     *      <li> Punto decimal no contenido entre dos dígitos.
     *      <li> Paréntesis desbalanceados.
     *      <li> Paréntesis vacíos.
     *      <li> Operador no seguido por un dígito o un signo negativo.
     *      <li> Falta de operador entre expresiones contenidas en paréntesis.
     *      <li> La expresión contiene letras.
     *      <li> La expresión contiene únicamente espacios.
     *      </ul>
     *  <li> True: si no presenta ninguno de los errores anteriores.
     *  </ul>
     */
    public static boolean revisaExpresion(String exp){
        PilaA<Character> verf=new PilaA();
        char aux;
        boolean res=false,banOp=false,banPun=false;
        int i=0;
        
        while(i<exp.length()-1 && exp.charAt(i)==' ')
            i++;
        aux=exp.charAt(i);
        if(Character.isDigit(aux) || aux=='(' || aux=='-'){
            verf.push(aux);
            if(aux=='-')
                banOp=true;
            res=true;
            i++;
            while(i<exp.length() && res){
                aux=exp.charAt(i);
                if(aux!=' '){
                    if(Character.isDigit(aux) && verf.peek()!=')'){
                        if(verf.peek()!='(')
                            verf.pop();
                        verf.push(aux);
                    }
                    else if(aux=='(' && (esOperador(verf.peek()) || verf.peek()=='(')){
                        if(verf.peek()!='(')
                            verf.pop();
                        verf.push(aux);
                    }
                    else if(esOperador(aux) && (Character.isDigit(verf.peek()) || verf.peek()==')' || (aux=='-' && !banOp && verf.peek()!='.'))){
                        banPun=false;
                        banOp=aux=='-' && verf.peek()=='-';
                        if(verf.peek()!='(')
                            verf.pop();
                        verf.push(aux);
                    }
                    else if(aux=='.' && (Character.isDigit(verf.peek()) && !banPun)){
                        banPun=true;
                        verf.pop();
                        verf.push(aux);
                    }
                    else if(aux==')' && !verf.isEmpty()){
                        char temp=verf.pop();
                        if((Character.isDigit(temp) || temp==')') && !verf.isEmpty() && verf.pop()=='('){
                            banPun=false;
                            verf.push(aux);
                        }
                        else
                            res=false;
                    }
                    else
                        res=false;
                }
                i++;
            }
            if(res && !verf.isEmpty()){
                aux=verf.pop();
                if(!verf.isEmpty() || !(Character.isDigit(aux) || aux==')'))
                    res=false;
            }  
        }
        return res;
    }
    /**
     * 
     * @param exp   Cadena a analizar
     * @param ini   Posición del paréntesis que abre.
     * @return  La posición del paréntesis que cierra, correspondiente al encontrado en la posición ini.
     */
    private static int buscaFinParentesis(String exp, int ini){
        do{
            ini++;
            if(exp.charAt(ini)=='(')
                ini=buscaFinParentesis(exp,ini);
        }while(exp.charAt(ini)!=')');
        ini++;
        return ini;
    }
    /**
     * 
     * @param exp   Cadena (expresión matemática) a convertir.
     * @return  Un arreglo de String que contiene el equivalente a la expresión en notación postfija, marcando el final de la expresión con un ";".
     */
    public static String[] conviertePostFija(String exp){
        String[] auxArr, postFija=new String[exp.length()+1];
        PilaA<Character> opers=new PilaA();
        int i=0,j=0,auxI;
        char temp;
        
        while(i<exp.length()-1 && exp.charAt(i)==' ')
            i++;
        if(exp.charAt(i)=='-'){
            postFija[0]="-";
            i++;
        }
        while(i<exp.length()){
            temp=exp.charAt(i);
            if(Character.isDigit(temp)){
                auxI=i;
                i++;
                while(i<exp.length() && (Character.isDigit(exp.charAt(i)) || exp.charAt(i)=='.'))
                    i++;
                if(postFija[j]!=null)
                    postFija[j]+=exp.substring(auxI, i);
                else
                    postFija[j]=exp.substring(auxI, i);
                j++;
            }
            else if(esOperador(temp)){
                while(!opers.isEmpty() && prioridad(temp)<=prioridad(opers.peek())){
                    postFija[j]=""+opers.pop();
                    j++;
                }
                opers.push(temp);
                i++;
                /*
                En caso de que haya un número negativo después del operador
                leído, se usa un while para saltar los posibles espacios
                intermedios y agregar dicho signo al inicio del siguiente
                elemento del arreglo postFija.
                */
                while(exp.charAt(i)==' ')
                    i++;
                if(exp.charAt(i)=='-'){
                    postFija[j]="-";
                    i++;
                }
            }
            /*
            En caso de que se lea un '(', se busca el ')' correspondiente,
            y se llama de manera recursiva este método para que convierta
            la expresión contenida dentro de los paréntesis con el método
            substring de la clase String.
             */
            else if(temp=='('){
                int k=0;
                auxI=i;
                i=buscaFinParentesis(exp,auxI);
                auxArr=conviertePostFija(exp.substring(auxI+1, i-1));
                while(!auxArr[k].equals(";")){
                    postFija[j]=auxArr[k];
                    j++;
                    k++;
                }
            }
            else if(temp==' ')
                i++;
        }
        while(!opers.isEmpty()){
            postFija[j]=""+opers.pop();
            j++;
        }
        postFija[j]=";";
        return postFija;
    }
    /**
     * 
     * @param postFija  Arreglo de String que contiene la expresión a evaluar en notación postfija.
     * @return Un double equivalente a la expresión dada.
     */
    public static double evaluaPostFija(String[] postFija){
        PilaA<Double> calcs=new PilaA();
        String temp;
        double num1,num2,res;
        int i=0;
        
        while(!postFija[i].equals(";")){
            temp=postFija[i];
            if(temp.length()==1 && esOperador(temp.charAt(0))){
                num2=calcs.pop();
                num1=calcs.pop();
                switch(temp.charAt(0)){
                    case '+':
                        calcs.push(num1+num2);
                        break;
                    case '-':
                        calcs.push(num1-num2);
                        break;
                    case '*':
                        calcs.push(num1*num2);
                        break;
                    case '/':
                        /*
                        No es necesario revisar si num2==0, pues
                        la clase Double lo hace de manera
                        predeterminada, y asigna un NaN (Not-a-Number)
                        en caso de 0/0, y un valor infinito en el 
                        caso de a/0 con a!=0.
                        */
                        calcs.push(num1/num2);
                        break;
                    case '^':
                        calcs.push(Math.pow(num1, num2));
                        break;
                }
            }
            else{
                calcs.push(Double.parseDouble(temp));
            }
            i++;
        }
        res=calcs.pop();
        if(!calcs.isEmpty())
            res=Double.NaN;
        return res;
    }
}
