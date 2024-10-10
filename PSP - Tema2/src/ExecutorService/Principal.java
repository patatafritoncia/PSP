package ExecutorService;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Declaro e instancio el ExecutorService
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        
        // Preparo una coleccion de objetos Callables, que cada uno hará una cosa
        Set<Callable<String>> callables = new HashSet<Callable<String>>();
        
        // Añado los objetos a la cola, cada uno con su operacion
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Tarea 1";
            }
        });
        
        callables.add(new Callable<String>(){
            public String call() throws Exception {
                return "Tarea 2";
            }
        });
        
        callables.add(new Callable<String>(){
            public String call() throws Exception {
                return "Tarea 3";
            }
        });
        
        // Declaro la lista de objetos Future y utilizo el método para llamar a todos
        java.util.List<Future<String>> futures = executorService.invokeAll(callables);
        
        // recojo las soluciones de cada uno de los objetos Future
        for (Future<String> future : futures) {
            System.out.println("future.get = " + future.get());
        }
        
        // Hay que terminar el proceso siempre
        executorService.shutdown();
        
    }
}
