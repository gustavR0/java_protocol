import java.lang.Math;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota {
    private static final long  serialVersionUID = 1L;

    protected ObjetoRemoto() throws RemoteException {
        super();
    }
    
    @Override
    public double areaCirculo(double radio) throws RemoteException{
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public double areaPoligonoRegular(double perimetro, double apotema) throws RemoteException{
        return perimetro * apotema/2;
    }
    
    /*
    @Override
    public double areaPoligonoIrregular(double X[], double Y[], int lados) throws RemoteException{
        double area = 0.0;        
        int j = lados - 1;
        
        for (int i = 0; i < lados; i++){
            area += (X[j] + X[i]) * (Y[j] - Y[i]);
            j = i; 
        }
        
        return Math.abs(area / 2.0);
    }
    */
} 
