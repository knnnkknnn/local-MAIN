package ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.SwingWorker;

/**
 *
 * @author Student
 */
public class MainPanel extends javax.swing.JPanel {

    private PC pc;
    private JPanel[] panels;
    DefaultListModel dlm; // модель списка
    StatusBar statusBar;

    public MainPanel(StatusBar statusBar) {
        initComponents();
        dlm = new DefaultListModel();
        dlm.clear();
        jList1.setModel(dlm);
        dlm.add(0, "Comp6");
        dlm.add(1, "Comp5");
        dlm.add(2, "Comp4");
        dlm.add(3, "Comp3");
        dlm.add(4, "Comp2");
        dlm.add(5, "Comp1");
        this.statusBar = statusBar;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();

        jButton1.setText("show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Запуск");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Диапозон:");

        jLabel2.setText("Интервал:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jButton2)
                .addContainerGap(71, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int countcomp = dlm.getSize();
        createComp(countcomp);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int start = Integer.valueOf(jSpinner1.getValue().toString());
        int end = Integer.valueOf(jSpinner2.getValue().toString());
        final String subnet = jTextField1.getText().trim();

        // Получаем количество секций из jSpinner2
        final int totalSections = Integer.valueOf(jSpinner2.getValue().toString());

        // Очищаем список и сбрасываем прогресс-бар
        dlm.clear();
        statusBar.setStatusPG(0);

        final int totalHosts = end - start + 1;
        final java.util.concurrent.atomic.AtomicInteger completedHosts = new java.util.concurrent.atomic.AtomicInteger(0);

        // Создаем SwingWorker для отслеживания прогресса
        SwingWorker<Void, Integer> progressWorker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                while (completedHosts.get() < totalHosts) {
                    // Каждый хост = одна секция
                    int progress = (completedHosts.get() * totalSections / totalHosts) * (100 / totalSections);
                    publish(Math.min(progress, 100));
                    Thread.sleep(50);
                }
                publish(100);
                return null;
            }

            @Override
            protected void process(List<Integer> chunks) {
                int progress = chunks.get(chunks.size() - 1);
                statusBar.setStatusPG(progress);
            }

            @Override
            protected void done() {
                statusBar.setStatusPG(100);
            }
        };

        // Запускаем отслеживание прогресса
        progressWorker.execute();

        // Многопоточное сканирование (остается без изменений)
        for (int i = start; i <= end; i++) {
            final int currentIp = i;

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        final String host = subnet + "." + currentIp;
                        int timeout = 200;

                        if (InetAddress.getByName(host).isReachable(timeout)) {
                            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                                public void run() {
                                    dlm.addElement(host);
                                }
                            });
                           // System.out.println(host + " is on the network");
                        } else {
                            //System.out.println("Not Reachable: " + host);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        completedHosts.incrementAndGet();
                    }
                }
            }).start();
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    private void createComp(int quantityComps) {
        panels = new JPanel[quantityComps];
        jPanel1.removeAll();
        for (int i = 0; i < quantityComps; i++) {
            final JPanel dot = new JPanel();
            pc = new PC(dlm.getElementAt(i).toString());
            dot.add(pc);
            panels[i] = dot;
        }

        JPanel mainPanel = new JPanel();
        //mainPanel.setBackground(Color.yellow);
        mainPanel.setLayout(new GridLayout(3, 3, 5, 5)); // 2 последних значения -- отступы

        for (int q = 0; q < panels.length; q++) {
            mainPanel.add(panels[q]);
        }
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(mainPanel, BorderLayout.CENTER);
        jPanel1.revalidate();

    }

    private void checkHost(String subnet, int start, int end) throws IOException {
        dlm.clear();
        int timeout = 100;
        int j = 0;
        for (int i = start; i < end; i++) {
            try {
                String host = subnet + "." + i;
                if (InetAddress.getByName(host).isReachable(timeout)) {
                    dlm.add(j, host);
                    j++;
                } else {
                    System.out.println("host unreacheble");
                }
            } catch (UnknownHostException ex) {
                Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
