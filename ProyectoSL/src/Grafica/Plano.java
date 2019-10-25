/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Dell
 */
public class Plano extends JFrame{
    
    double x1, x2, y1, y2;

    public Plano() {
    }
    
    private static final long serialVersionUID = 6294689542092367723L;

  public Plano(String title, double x1, double x2, double y1, double y2) {
    super(title);

    // Create dataset
    XYDataset dataset = createDataset(x1, x2, y1, y2);

    // Create chart
    JFreeChart chart = ChartFactory.createXYLineChart(
        "XY Line Chart Example",
        "X-Axis",
        "Y-Axis",
        dataset,
        PlotOrientation.VERTICAL,
        true, true, false);

    // Create Panel
    ChartPanel panel = new ChartPanel(chart);
    setContentPane(panel);
  }

  private XYDataset createDataset(double x1, double x2, double y1, double y2) {
    XYSeriesCollection dataset = new XYSeriesCollection();

    XYSeries series = new XYSeries("Distancia Uclidiana");
    
    /*
    series.add(2, 4);
    series.add(8, 10);
    series.add(10, 12);
    */
    
    series.add(x1, y1);
    series.add(x2, y2);

    //Add series to dataset
    dataset.addSeries(series);
    
    return dataset;
  }

  
}
