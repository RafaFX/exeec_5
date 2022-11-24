import java.util.List;

public class Fila {




    
    public void Fifo(List<Frame> fila){

        int index = 0;

        for(int i = 0; i < fila.size(); i++){
            if(fila.get(index).getTempoCarga() > fila.get(i).getTempoCarga()){

                index = i;
                System.out.println("Para a substituição de páginas em FIFO deve ser susbtituido o frame de id:"+fila.get(index).getId() );
                
            }
        }
    }

    public void LFU(List<Frame> fila){

        int index = 0;
    
        for(int i = 0; i < fila.size(); i++){
            if(fila.get(index).getQtdRef() > fila.get(i).getQtdRef()){
    
                index = i;
                System.out.println("Para a substituição de páginas em LFU deve ser susbtituido o frame de id:"+fila.get(index).getId() );
                
            }
        }
    }

    public void LRU(List<Frame> fila){

        int index = 0;
    
        for(int i = 0; i < fila.size(); i++){
            if(fila.get(index).getTempoRef() > fila.get(i).getTempoRef()){
                
                index = i;
                System.out.println("Para a substituição de páginas em LRU deve ser susbtituido o frame de id:"+fila.get(index).getId() );
                
            }
        }
    }

    public void NRU(List<Frame> fila){

        int index = 0;
    
        for(int i = 0; i < fila.size(); i++){
            if(fila.get(index).getBr() > fila.get(i).getBr() && fila.get(index).getBm() > fila.get(i).getBm()){
                index = i;
                System.out.println("Para a substituição de páginas em NRU deve ser susbtituido o frame de id:"+fila.get(index).getId() );
            }
        }
    }


    // TESTE RETURN

    // public int Fifo(List<Frame> fila){

    //     int index = 0;

    //     for(int i = 0; i < fila.size(); i++){
    //         if(fila.get(index).getTempoCarga() > fila.get(i).getTempoCarga()){

    //             index = i;
    //             System.out.println("deve ser susbtituido o frame de id:"+fila.get(index).getId() );
                
    //         }else{
    //             System.out.println("Teste");
    //         }
            
    //     }return fila.get(index).getId();

}
