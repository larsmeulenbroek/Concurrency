import akka.actor.UntypedActor;

/**
 * Created by Wilco on 11-10-2016.
 */
public class VakAgent extends UntypedActor {

    private int amountOfCustomers;

    @Override
    public void onReceive(Object message) throws Throwable {

        if (message instanceof Integer) {
            int amountOfCustomers = (int) message;

            // verdeel de customers over een bepaald aantal salesagents afhankelijk van het aantal customers


        }



    }
}
