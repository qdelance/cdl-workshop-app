package fr.capitoldulibre;

import org.jooby.Jooby;

public class App extends Jooby {

    {
        get("/", () -> "Hey Capitol Du Libre !");
    }

    public static void main(final String[] args) throws Throwable {
        run(App::new, args);
    }

}
