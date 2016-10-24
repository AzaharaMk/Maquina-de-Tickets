
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstacionTren
{
    private MaquinaTicket maquina1;
    private MaquinaTicket maquina2;
    private int totalMoneda;

    public EstacionTren()
    {
        maquina1 = new MaquinaTicket(300);
        maquina2 = new MaquinaTicket(200);
        totalMoneda = 0;
  }
  
  public void mostrarTotalMoneda()
 {
        totalMoneda = maquina1.obtenerTotal();
        totalMoneda = totalMoneda + maquina2.obtenerTotal();
    System.out.println(totalMoneda);
}

public void ImprimirTicket()
{
    maquina1.insertarDinero(300);
    maquina2.insertarDinero(200);
    
    maquina1.imprimirTicket();
    maquina2.imprimirTicket();
}
}
