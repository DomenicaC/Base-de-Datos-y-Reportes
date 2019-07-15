/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.BaseDatos;
import ec.edu.ups.controlador.ContorladorBasePersona;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Domenica Cañizares
 */
public class ReportesPDF extends javax.swing.JFrame {

    /**
     * Creates new form ReportesPDF
     */
    int cont = 0;
    int cont1 = 0;
    int cont2 = 0;
    int cont3 = 0;
    int cont4 = 0;
    int conp1 = 0;
    int conp2 = 0;
    int conp3 = 0;
    int conp4 = 0;
    int conp5 = 0;
    int conp6 = 0;
    int conp7 = 0;
    int conp8 = 0;
    Double suma1 = 0.00;
    Double suma2 = 0.00;
    Double suma3 = 0.00;
    Double suma4 = 0.00;
    Double suma5 = 0.00;
    Double suma6 = 0.00;
    Double suma7 = 0.00;
    Double suma8 = 0.00;
    double[] sumas;
    int[] contadores;
    double[] acumulador;
    String url = "jdbc:postgresql://localhost:5432/BaseDatosReportes";
    String user = "postgres";
    String password = "johysydanny15";
    Set<Persona> listaPersonas;
    ContorladorBasePersona controlador = new ContorladorBasePersona(url, user, password);

    public ReportesPDF() {
        initComponents();

        // BaseDatos base = new BaseDatos(url, user, password);
        //base.conectar();
        //ContorladorBasePersona controlador = new ContorladorBasePersona();
        //condiciones();
    }

    public void generarGraficas() {
        condiciones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPdfTodo = new javax.swing.JButton();
        btnGrafixas = new javax.swing.JButton();
        jPanelG2 = new javax.swing.JPanel();
        jPanelG1 = new javax.swing.JPanel();
        jPanelG3 = new javax.swing.JPanel();
        btnPdfCedula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPdfTodo.setText("Generar PDF General");
        btnPdfTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfTodoActionPerformed(evt);
            }
        });

        btnGrafixas.setText("Generar Graficos");
        btnGrafixas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrafixasActionPerformed(evt);
            }
        });

        jPanelG2.setBorder(javax.swing.BorderFactory.createTitledBorder("Grafico 2"));

        javax.swing.GroupLayout jPanelG2Layout = new javax.swing.GroupLayout(jPanelG2);
        jPanelG2.setLayout(jPanelG2Layout);
        jPanelG2Layout.setHorizontalGroup(
            jPanelG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );
        jPanelG2Layout.setVerticalGroup(
            jPanelG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        jPanelG1.setBorder(javax.swing.BorderFactory.createTitledBorder("Grafico 1"));

        javax.swing.GroupLayout jPanelG1Layout = new javax.swing.GroupLayout(jPanelG1);
        jPanelG1.setLayout(jPanelG1Layout);
        jPanelG1Layout.setHorizontalGroup(
            jPanelG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );
        jPanelG1Layout.setVerticalGroup(
            jPanelG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        jPanelG3.setBorder(javax.swing.BorderFactory.createTitledBorder("Grafico 3"));

        javax.swing.GroupLayout jPanelG3Layout = new javax.swing.GroupLayout(jPanelG3);
        jPanelG3.setLayout(jPanelG3Layout);
        jPanelG3Layout.setHorizontalGroup(
            jPanelG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );
        jPanelG3Layout.setVerticalGroup(
            jPanelG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        btnPdfCedula.setText("Generar PDF Cedula");
        btnPdfCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfCedulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jPanelG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnPdfTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPdfCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrafixas)))
                .addContainerGap(214, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanelG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(421, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPdfTodo)
                    .addComponent(btnPdfCedula)
                    .addComponent(btnGrafixas))
                .addGap(18, 18, 18)
                .addComponent(jPanelG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jPanelG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(381, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrafixasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrafixasActionPerformed

        generarGraficas();

    }//GEN-LAST:event_btnGrafixasActionPerformed

    private void btnPdfTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfTodoActionPerformed

        try {

            BaseDatos base = new BaseDatos(url, user, password);
            base.conectar();

            File reporteArchivo = new File("src/ec/edu/ups/reportes/personas.jasper");

            JasperReport reporteJasper = (JasperReport) JRLoader.loadObject(reporteArchivo);

            JasperPrint jasperPrint = JasperFillManager.fillReport(reporteJasper, null, base.getConexionBD());

            JasperExportManager.exportReportToPdfFile(jasperPrint, "ReporteTodo.pdf");

            JasperViewer.viewReport(jasperPrint);

            base.desconectar();

        } catch (JRException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnPdfTodoActionPerformed

    private void btnPdfCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfCedulaActionPerformed

        cedulaDireccion();

    }//GEN-LAST:event_btnPdfCedulaActionPerformed
    public void condiciones() {

        sumas = new double[38];
        contadores = new int[38];
        acumulador = new double[38];
        listaPersonas = controlador.printPer();

        for (Persona persona : listaPersonas) {
            if (persona.getEdad() >= 16 && persona.getEdad() <= 20) {
                
                if (persona.getGenero().equals("Masculino")) {
                    conp1++;
                    suma1 = suma1 + persona.getSueldo();
                }
                if (persona.getGenero().equals("Femenino")) {
                    conp2++;
                    suma2 = suma2 + persona.getSueldo();
                }
                cont1++;
            }

            if (persona.getEdad() >= 21 && persona.getEdad() <= 30) {
                
                if (persona.getGenero().equals("Masculino")) {
                    conp3++;
                    suma3 = suma3 + persona.getSueldo();
                }
                if (persona.getGenero().equals("Femenino")) {
                    conp4++;
                    suma4 = suma4 + persona.getSueldo();
                }
                cont2++;
            }

            if (persona.getEdad() >= 31 && persona.getEdad() <= 40) {
                
                if (persona.getGenero().equals("Masculino")) {
                    conp5++;
                    suma5 = suma5 + persona.getSueldo();
                }
                if (persona.getGenero().equals("Femenino")) {
                    conp6++;
                    suma6 = suma6 + persona.getSueldo();
                }
                cont3++;
            }

            if (persona.getEdad() >= 41) {
                
                if (persona.getGenero().equals("Masculino")) {
                    conp7++;
                    suma7 = suma7 + persona.getSueldo();
                }
                if (persona.getGenero().equals("Femenino")) {
                    conp8++;
                    suma8 = suma8 + persona.getSueldo();
                }
                cont4++;
            }
            cont++;
        }

        int i = 0;
        for (int ed = 16; ed <= 53; ed++) {

            for (Persona persona : listaPersonas) {
                if (persona.getEdad() == ed) {
                    sumas[i] = sumas[i] + persona.getSueldo();
                    contadores[i]++;
                }
            }
            if (contadores[i] == 0) {
                acumulador[i] = 0;
            } else {
                acumulador[i] = sumas[i] / contadores[i];
            }
            i++;
        }
        grafico1();
        grafico2();
        grafico3();
    }

    public void cedulaDireccion() {

        BaseDatos base = new BaseDatos(url, user, password);
        base.conectar();

        try {

            String cedula = JOptionPane.showInputDialog("Ingrese la cedula");

            Map cedula1 = new HashMap();
            cedula1.put("DIR_PER_CEDULA", cedula);
            File reporte = new File("src/ec/edu/ups/reportes/personasCed.jasper");
            JasperReport reporteJasper = (JasperReport) JRLoader.loadObject(reporte);
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporteJasper, cedula1, base.getConexionBD());
            JasperExportManager.exportReportToPdfFile(jasperPrint, "ReporteCedula.pdf");
            JasperViewer.viewReport(jasperPrint);

        } catch (JRException ex) {
            ex.printStackTrace();
        }

    }

    public void grafico1() {
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Entre 16-20", cont1);
        data.setValue("Entre 21-30", cont2);
        data.setValue("Entre 31-40", cont3);
        data.setValue("Mayores a 40", cont4);

        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
                "Promedio por Edades",
                data,
                true,
                true,
                false);

        // Mostrar Grafico
        ChartPanel frame = new ChartPanel(chart);
        jPanelG1.setLayout(new java.awt.BorderLayout());
        jPanelG1.add(frame, BorderLayout.CENTER);
        jPanelG1.validate();

    }

    public void grafico2() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue((suma2 / conp2), "Mujeres", "16-20");
        dataset.setValue((suma1 / conp1), "Hombres", "16-20");
        dataset.setValue((suma4 / conp4), "Mujeres", "21-30");
        dataset.setValue((suma3 / conp3), "Hombres", "21-30");
        dataset.setValue((suma6 / conp6), "Mujeres", "31-40");
        dataset.setValue((suma5 / conp5), "Hombres", "31-40");
        dataset.setValue((suma8 / conp8), "Mujeres", "Mayores 40");
        dataset.setValue((suma7 / conp7), "Hombres", "Mayores 40");

        // Creando el Grafico
        
        JFreeChart chart = ChartFactory.createBarChart3D("Promedio de Salario", "Genero", "Salario",
                dataset, PlotOrientation.VERTICAL, true, true, false);
        
        chart.getTitle().setPaint(Color.BLUE);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.red);
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);

        jPanelG2.setLayout(new java.awt.BorderLayout());
        jPanelG2.add(chartPanel, BorderLayout.CENTER);
        jPanelG2.validate();
    }

    public void grafico3() {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();

        int ed = 16;
        for (int i = 0; i < sumas.length; i++) {
            String edad = String.valueOf(ed);
            line_chart_dataset.addValue(acumulador[i], "salario", edad);
            ed++;
        }

        // Creando el Grafico
        JFreeChart chart = ChartFactory.createLineChart("Promedio por Edad",
                "Edades", "Salario", line_chart_dataset, PlotOrientation.VERTICAL,
                true, true, false);

        // Mostrar Grafico
        ChartPanel chartPanel1 = new ChartPanel(chart);
        jPanelG3.setLayout(new java.awt.BorderLayout());
        jPanelG3.add(chartPanel1, BorderLayout.CENTER);
        jPanelG3.validate();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReportesPDF.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportesPDF.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportesPDF.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportesPDF.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportesPDF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrafixas;
    private javax.swing.JButton btnPdfCedula;
    private javax.swing.JButton btnPdfTodo;
    private javax.swing.JPanel jPanelG1;
    private javax.swing.JPanel jPanelG2;
    private javax.swing.JPanel jPanelG3;
    private javax.swing.JPanel panelG3;
    private javax.swing.JPanel panelG4;
    private javax.swing.JPanel panelG5;
    private javax.swing.JPanel panelG6;
    private javax.swing.JPanel panelG7;
    private javax.swing.JPanel panelG8;
    private javax.swing.JPanel panelG9;
    // End of variables declaration//GEN-END:variables
}
