package com.example.towerdefense;

import android.graphics.Path;


public class Difficulty {
    private int layout;
    private Path path;
    private int numWitches;
    private int numWizards;
    private int numArchers;
    private double[] monumentCoords;
//    private int width = 553;
//    private int height = 311;

    public Difficulty (Player player) {
        String difficulty = player.getDifficulty();
        if (difficulty.equals("easy")) {
            setLayout(R.layout.activity_easy_screen);
            setNumArchers(2);
            setNumWitches(2);
            setNumWizards(2);
            setMonumentCoords(new double[2]);
            getMonumentCoords()[0] = 1755.0;
            getMonumentCoords()[1] = 835.0;

            //path.lineTo
            int width = 650;
            int height = 450;
            path = new Path();

            path.moveTo((int)pxFromDp(0.169 * width), 0);


            path.lineTo(pxFromDp(0.169 * width), pxFromDp(0.376 * height));

            path.lineTo((int) pxFromDp(0.287 * width), (int) pxFromDp(0.376 * height));

            path.lineTo((int) pxFromDp(0.287 * width), (int) pxFromDp(0.644 * height));

            path.lineTo((int) pxFromDp(0.169 * width), (int) pxFromDp(0.644 * height));

            path.lineTo((int) pxFromDp(0.169 * width), (int) pxFromDp(.871 * height));

            path.lineTo((int) pxFromDp(0.539 * width), (int) pxFromDp(.871 * height));

            path.lineTo((int) pxFromDp(0.539 * width), (int) pxFromDp(.187 * height));

            path.lineTo((int) pxFromDp(0.832 * width), (int) pxFromDp(.187 * height));

            path.lineTo((int) pxFromDp(0.832 * width), (int) pxFromDp(.426 * height));

            path.lineTo((int) pxFromDp(0.705 * width), (int) pxFromDp(.426 * height));

            path.lineTo((int) pxFromDp(0.705 * width), (int) pxFromDp(.688 * height));

            path.lineTo((int) pxFromDp(width), (int) pxFromDp(.688 * height));

        } else if (difficulty.equals("medium")) {
            int width = 650;
            int height = 450;
            setLayout(R.layout.activity_medium_screen);
            setNumArchers(3);
            setNumWitches(3);
            setNumWizards(3);

            setMonumentCoords(new double[2]);
            getMonumentCoords()[0] = 1351.0;
            getMonumentCoords()[1] = 1215.0;

            //path.lineTo
            path = new Path();

            path.moveTo((int)pxFromDp(0.170 * width), 0);


            path.lineTo(pxFromDp(0.170 * width), pxFromDp(0.749 * height));

            path.lineTo((int) pxFromDp(0.464 * width), (int) pxFromDp(0.749 * height));

            path.lineTo((int) pxFromDp(0.464 * width), (int) pxFromDp(0.350 * height));

            path.lineTo((int) pxFromDp(0.770 * width), (int) pxFromDp(0.350 * height));

            path.lineTo((int) pxFromDp(0.770 * width), (int) pxFromDp(height));



        } else {
            setLayout(R.layout.activity_hard_screen);
            setNumArchers(3);
            setNumWitches(4);
            setNumWizards(4);

            setMonumentCoords(new double[2]);
            getMonumentCoords()[0] = 1242.0;
            getMonumentCoords()[1] = 1215.0;


            //path.lineTo

            int width = 650;
            int height = 450;

            //path
            path = new Path();
            path.moveTo((int)pxFromDp(0.183 * width), 0);


            path.lineTo(pxFromDp(0.183 * width), pxFromDp(0.457 * height));

            path.lineTo((int) pxFromDp(0.708 * width), (int) pxFromDp(0.457 * height));

            path.lineTo((int) pxFromDp(0.708 * width), (int) pxFromDp(height));


        }
    }

    public static int pxFromDp(double d) {
        float scale = 432f;
        float dp = (float) d;
        float px = dp * (scale/160);
        return (int) px;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public int getNumWitches() {
        return numWitches;
    }

    public void setNumWitches(int numWitches) {
        this.numWitches = numWitches;
    }

    public int getNumWizards() {
        return numWizards;
    }

    public void setNumWizards(int numWizards) {
        this.numWizards = numWizards;
    }

    public int getNumArchers() {
        return numArchers;
    }

    public void setNumArchers(int numArchers) {
        this.numArchers = numArchers;
    }

    public double[] getMonumentCoords() {
        return monumentCoords;
    }

    public void setMonumentCoords(double[] monumentCoords) {
        this.monumentCoords = monumentCoords;
    }
}
