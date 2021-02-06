package Source;


import java.awt.BasicStroke;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import javax.swing.JPanel;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Color;

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

public class Graficas {
    private static final long serialVersionUID = 6294689542092367723L; 
    JFreeChart grafica;
    XYSeriesCollection datos = new XYSeriesCollection();
    double x;
    double y;
    String titulo, tx,ty;
    
    final static int LINEAL = 1;
    final static int POLAR = 2;
    final static int DISPERSION = 3;
    final static int AREA = 4;
    final static int LOGARITMICA = 5;
    final static int SERIETIEMPO = 6;
    final static int PASO = 7;
    final static int PASOAREA = 8;
    
    public Graficas (int tipo, String titulo){
        this.titulo = titulo;
        tipoGrafica(tipo);
    }
    
    public Graficas (int tipo,String titulo,double x,double y){
        this.titulo = titulo;
        this.x =x;
        this.y = y;
        tipoGrafica(tipo);
    }
    
    public Graficas(double x,double y){
        this.x = x;
        this.y = y;
    }
     public Graficas(){}
    
    public void tipoGrafica(int tipo){
        switch(tipo){
            case LINEAL:
                grafica = ChartFactory.createXYLineChart(titulo, tx, ty, datos, PlotOrientation.VERTICAL, true, true, true);
                break;
            case POLAR:
                grafica = ChartFactory.createPolarChart(titulo, datos, true, true, true);
                break;
            case DISPERSION:
                grafica = ChartFactory.createScatterPlot(titulo, tx, ty, datos, PlotOrientation.VERTICAL, true, true, true);
                break;
            case AREA:
                grafica = ChartFactory.createXYAreaChart(titulo, tx, ty, datos, PlotOrientation.VERTICAL, true, true, true);
                break;
            case LOGARITMICA:
                grafica = ChartFactory.createXYLineChart(titulo, tx, ty, datos, PlotOrientation.VERTICAL, true, true, true);
                XYPlot ejes=grafica.getXYPlot();
                NumberAxis rango = new LogarithmicAxis(ty);
                ejes.setRangeAxis(rango);
                break;
            case SERIETIEMPO:
                grafica = ChartFactory.createTimeSeriesChart(titulo, tx, ty, datos, true, true, true);
                break;
            case PASO:
                grafica = ChartFactory.createXYStepChart(titulo, ty, tx, datos, PlotOrientation.VERTICAL, true, true, true);
                break;
            case PASOAREA:
                grafica = ChartFactory.createXYStepAreaChart(titulo, tx, ty, datos, PlotOrientation.VERTICAL, true, true, true);
                break;
                
        }
            
    }
        
    public void agregarGrafica(String id,double [] x,double []y){
        XYSeries s = new XYSeries(id);
        int n = x.length;
        for(int i=0;i<n;i++){
            s.add(x[i],y[i]);
        }
        datos.addSeries(s);
    }
    
    public ChartPanel obtienePanel(){
        return new ChartPanel(grafica);
    }
    
    public void agregarGrafica(double x,double y,String s){
        this.x =x;
        this.y =y;
        XYSeries complejo = new XYSeries("numComplejo");
 
        complejo.add(0,0);
        complejo.add(x, y);
        
        XYSeriesCollection dataset = new XYSeriesCollection();    
        dataset.addSeries(complejo);
        
        JFreeChart xylineChart = ChartFactory.createXYLineChart("Gráfica ri"+s, "u", "v", dataset,PlotOrientation.VERTICAL,true,true,false);
        XYPlot plot = xylineChart.getXYPlot();
        
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(1.0f));
        plot.setRenderer(renderer);
        
        ChartPanel panel = new ChartPanel(xylineChart);
        
        JFrame ventana = new JFrame("Graficador");
        ventana.setVisible(true);
        ventana.setSize(600,600);
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        ventana.add(panel);
    }
     public void agregarGrafica(ArrayList<Double> arrayReales,ArrayList<Double> arrayImaginarios,int n){
        
       
        ///NUEVA
            SwingUtilities.invokeLater(() -> {  
            ScatterPlotExample example = new ScatterPlotExample(arrayReales,arrayImaginarios,n);  
            example.setSize(600, 600);  
            example.setLocationRelativeTo(null);  
            example.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);  
            example.setVisible(true);  
            });
    }
     
     public void agregarGrafica(double x,double y,double q,double z){
        this.x =x;
        this.y =y;
        XYSeries complejo = new XYSeries("numComplejo");
 
       // complejo.add(0,0);
        //complejo.add(x, y);
        complejo.add(x,y);
        complejo.add(q,z);
        
        XYSeriesCollection dataset = new XYSeriesCollection();    
        dataset.addSeries(complejo);
        
        JFreeChart xylineChart = ChartFactory.createXYLineChart("Gráfica ri", "u", "v", dataset,PlotOrientation.VERTICAL,true,true,false);
        XYPlot plot = xylineChart.getXYPlot();
        
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(1.0f));
        plot.setRenderer(renderer);
        
        ChartPanel panel = new ChartPanel(xylineChart);
        
        JFrame ventana = new JFrame("Graficador");
        ventana.setVisible(true);
        ventana.setSize(600,600);
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        ventana.add(panel);
    }
    
}
