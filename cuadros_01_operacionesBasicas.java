import javax.swing.JOptionPane;
public class cuadros_01_operacionesBasicas {
    public static void main(String[] args) {
        double num1,num2,a,s,m,d;
        String ops1,ops2;
        JOptionPane.showMessageDialog(null,"operaciones aritmeticas");
        ops1=JOptionPane.showInputDialog("ingresa el primer numero: ");
        num1=Double.parseDouble(ops1);
        //
        ops2=JOptionPane.showInputDialog("ingresa el segundo numero: ");
        num2=Double.parseDouble(ops2);
        a = num1+num2;
        s = num1-num2;
        m = num1*num2;
        d = num1/num2;
        JOptionPane.showMessageDialog(null,num1+" + "+num2+"="+a);
        JOptionPane.showMessageDialog(null,num1+" - "+num2+"="+a);
        JOptionPane.showMessageDialog(null,num1+" * "+num2+"="+a);
        JOptionPane.showMessageDialog(null,num1+" / "+num2+"="+a);
                
                }
    
}
