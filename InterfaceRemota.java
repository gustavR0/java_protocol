import java.rmi.*;

public interface InterfaceRemota extends Remote{
    public double areaCirculo(double radio) throws RemoteException;
    public double areaPoligonoRegular(double perimetro, double apotema) throws RemoteException;
    //public double areaPoligonoIrregular(double X[], double Y[],int lados) throws RemoteException;
}
