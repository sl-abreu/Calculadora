/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocalculadora;

/**
 *
 * <pre>
 * Interfaz gráfica con funcionalidad de una calculadora científica,
 * es capaz de evaluar expresiones respetando la jerarquía de operaciones
 * o el orden de los paréntesis en caso de que existan.
 * 
 * Realiza tres recorridos a la expresión, en la primera se revisa la sintaxis
 * de la expresión dada por el usuario, en caso de que sea correcta se realiza
 * el segundo recorrido, en el que se convierte la expresión de notación infija
 * a notación postfija, con el fin de hacer la posterior evaluación posible. Por
 * último, se evalúa la expresión y se muestra el valor correspondiente.
 * 
 * En caso de que la sintaxis fuera incorrecta, se muestra un mensaje apropiado
 * al usuario y no se pasa al segundo y tercer recorrido.
 * </pre>
 * @author SLGA
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraVista
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        expTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        evaluaBut = new javax.swing.JButton();
        limpBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        expTxt.setText("   ");

        jLabel1.setText("Expresión a evaluar:");

        evaluaBut.setText("Evaluar");
        evaluaBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluaButActionPerformed(evt);
            }
        });

        limpBut.setText("Limpiar");
        limpBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpButActionPerformed(evt);
            }
        });

        jLabel2.setText("=");

        resTxt.setEditable(false);
        jScrollPane1.setViewportView(resTxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(evaluaBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpBut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limpBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(evaluaBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void evaluaButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluaButActionPerformed
        String resS, exp=expTxt.getText();
                if(!exp.isEmpty() && revisaExpresion(exp)){
                    Double resD=evaluaPostFija(conviertePostFija(exp));
                    if(!resD.isNaN())
                        resS=""+resD;
                    else
                        resS="¡Valor indefinido!";
                }
                else
                    resS="Error de sintaxis, favor de revisar la expresión.";
                resTxt.setText(resS);
    }//GEN-LAST:event_evaluaButActionPerformed

    private void limpButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpButActionPerformed
        resTxt.setText("");
        expTxt.setText("");
    }//GEN-LAST:event_limpButActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton evaluaBut;
    protected javax.swing.JTextField expTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JButton limpBut;
    protected javax.swing.JTextField resTxt;
    // End of variables declaration//GEN-END:variables

    //Métodos creados
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
     *  <li> False: si no se cumple ninguno de los anteriores.
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
                        if(aux=='-' && verf.peek()=='-')
                            banOp=true;
                        else
                            banOp=false;
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
    private static int rangoParentesis(String exp, int ini){
        do{
            ini++;
            if(exp.charAt(ini)=='(')
                ini=rangoParentesis(exp,ini);
        }while(exp.charAt(ini)!=')');
        ini++;
        return ini;
    }
    /**
     * 
     * @param exp   Cadena (expresión matemática) a convertir.
     * @return  Un arreglo de String que contiene el equivalente a la expresión en notación postfija.
     */
    public static String[] conviertePostFija(String exp){
        String[] auxArr, postFija=new String[exp.length()+1];
        PilaA<Character> opers=new PilaA();
        int i=0,j=0,auxI;
        char temp;
        
        if(exp.charAt(0)=='-'){
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
                if(i<exp.length() && exp.charAt(i)=='-'){
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
                i=rangoParentesis(exp,auxI);
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
                        if(num2!=0)
                            calcs.push(num1/num2);
                        else if(num1==0)
                            calcs.push(Double.NaN);
                        else if(num1>0)
                            calcs.push(Double.POSITIVE_INFINITY);
                        else
                            calcs.push(Double.NEGATIVE_INFINITY);
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
            res=909.909;
        return res;
    }
}