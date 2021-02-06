package Source;

import java.awt.Color;  
import java.util.ArrayList;
import javax.swing.JFrame;  
import javax.swing.SwingUtilities;  
import javax.swing.WindowConstants;  
import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.plot.XYPlot;  
import org.jfree.data.xy.XYDataset;  
import org.jfree.data.xy.XYSeries;  
import org.jfree.data.xy.XYSeriesCollection;  
  
public class ScatterPlotExample extends JFrame {  
  private static final long serialVersionUID = 6294689542092367723L;  
  ArrayList<Double> arrayReales;
  ArrayList<Double> arrayImaginarios;
  int n;
  public ScatterPlotExample(ArrayList<Double> arrayReales,ArrayList<Double> arrayImaginarios,int n) {  
     this.arrayReales = arrayReales;
     this.arrayImaginarios = arrayImaginarios;
     this.n = n;  
    // Create dataset  
    XYDataset dataset = createDataset();  
  
    // Create chart  
    JFreeChart chart = ChartFactory.createScatterPlot(  
        "Raices",   
        "u", "v", dataset);  
  
      
    //Changes background color  
    XYPlot plot = (XYPlot)chart.getPlot();  
    plot.setBackgroundPaint(new Color(190,190,190));//azul 176,196,222  
      
     
    // Create Panel  
    ChartPanel panel = new ChartPanel(chart);  
    setContentPane(panel);  
  }  
  
  public XYDataset createDataset() {  
    XYSeriesCollection dataset = new XYSeriesCollection();  
  
    //Boys (Age,weight) series  
    XYSeries series1 = new XYSeries("Z");
    for(int i=0;i<n;i++){
        series1.add(arrayReales.get(i),arrayImaginarios.get(i));
    }
    dataset.addSeries(series1);  
    
    
    return dataset;  
  } 
}
