package ThreadsPractice.ProducerAndConsumer;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Teat {

	public static void main(String[] args) {
		ExecutorService executorService= Executors.newFixedThreadPool(2);

        //CompletionStage-------second completion stage
        CompletableFuture<String> completableFuture = getPopcorn(executorService).thenCombine(getSoda(executorService), (popcorn, soda) ->
                getOrder());

        completableFuture.thenAccept(order-> System.out.println("Printing receipt"))
                .thenRun(()-> System.out.println("Give receipt and order to customer"));

        System.out.println("Ask cutomer if he/she needs anything else ?");

        executorService.shutdown();

    }

    public static String getOrder()
    {
        return "Order is ready";
    }

    public static CompletableFuture<String> getPopcorn(ExecutorService executorService)
    {
        return CompletableFuture.supplyAsync(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            return "Popcorn ready";
        },executorService);
    }

    public static CompletableFuture<String> getSoda(ExecutorService executorService)
    {
        return CompletableFuture.supplyAsync(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            return "Soda ready";
        },executorService);
    }
	}

