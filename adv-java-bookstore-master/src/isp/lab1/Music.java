package isp.lab1;

import isp.lab1.Product;

import java.time.Duration;

public interface Music extends Product {
    public String getArtist();

    public Duration getPlayingTime();

}
