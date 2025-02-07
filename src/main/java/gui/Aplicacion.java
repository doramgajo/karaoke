package gui;

import crud.exceptions.NonexistentEntityException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import objetos.Cancion;
import objetos.Karaoke;
import objetos.Usuario;


public class Aplicacion extends javax.swing.JFrame {

    /**
     * Creates new form Aplicacion
     */
    public Aplicacion() throws UnsupportedLookAndFeelException {
        initComponents();
        iniciar();
    }

    private void iniciar() throws UnsupportedLookAndFeelException {
        new GestionDeConexion(this, true).setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        tabbedpanePrincipal = new javax.swing.JTabbedPane();
        panelKaraoke = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxCanciones = new javax.swing.JComboBox<>();
        comboBoxUsuarios = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelGestion = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGestionCanciones = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaGestionUsuarios = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        botonAnnadirUsuario = new javax.swing.JButton();
        botonEditarUsuario = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaGestionKaraokes = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelInformacion = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaInfoTopCanciones = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaInfoTopCantantes = new javax.swing.JTable();
        panelBuscarPorFecha = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaInfoBuscarFecha = new javax.swing.JTable();
        panelCalendario = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Karaoke");
        setMinimumSize(new java.awt.Dimension(1000, 750));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panelKaraoke.setLayout(new javax.swing.OverlayLayout(panelKaraoke));

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 750));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Canción:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(30, 30, 10, 30);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 10, 30);
        jPanel2.add(jLabel3, gridBagConstraints);

        comboBoxCanciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboBoxCanciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High hopes", "Smells like teen spirit" }));
        comboBoxCanciones.setMaximumSize(new java.awt.Dimension(300, 300));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 10, 30);
        jPanel2.add(comboBoxCanciones, gridBagConstraints);

        comboBoxUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboBoxUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wilfredo Amaro", "Ana Quesada", "Xavier Nateras", "Alejandro Nieves" }));
        comboBoxUsuarios.setMaximumSize(new java.awt.Dimension(300, 300));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 10, 30);
        jPanel2.add(comboBoxUsuarios, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reproducir.png"))); // NOI18N
        jButton1.setText("Reproducir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(25, 30, 30, 30);
        jPanel2.add(jButton1, gridBagConstraints);

        panelKaraoke.add(jPanel2);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.png"))); // NOI18N
        jPanel1.add(jLabel1);

        panelKaraoke.add(jPanel1);

        tabbedpanePrincipal.addTab("Karaoke", panelKaraoke);

        panelGestion.setLayout(new java.awt.GridLayout(1, 0));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel3.setLayout(new java.awt.BorderLayout());

        tablaGestionCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Título", "Artista"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaGestionCanciones);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jButton9.setText("Añadir canción");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9);

        jButton10.setText("Editar canción");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10);

        jButton11.setText("Eliminar canción");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11);

        jButton12.setText("Actualizar tabla");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12);

        jPanel3.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jTabbedPane1.addTab("Canciones", jPanel3);

        jPanel5.setLayout(new java.awt.BorderLayout());

        tablaGestionUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaGestionUsuarios);

        jPanel5.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        botonAnnadirUsuario.setText("Añadir usuario");
        botonAnnadirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnnadirUsuarioActionPerformed(evt);
            }
        });
        jPanel7.add(botonAnnadirUsuario);

        botonEditarUsuario.setText("Editar usuario");
        botonEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarUsuarioActionPerformed(evt);
            }
        });
        jPanel7.add(botonEditarUsuario);

        jButton8.setText("Eliminar usuario");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton8);

        jButton5.setText("Actualizar tabla");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5);

        jPanel5.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jTabbedPane1.addTab("Usuarios", jPanel5);

        jPanel4.setLayout(new java.awt.BorderLayout());

        tablaGestionKaraokes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Canción", "Usuario", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaGestionKaraokes);

        jPanel4.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jButton6.setText("Añadir karaoke");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6);

        jButton3.setText("Editar karaoke");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3);

        jButton4.setText("Eliminar karaoke");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4);

        jButton2.setText("Actualizar tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2);

        jPanel4.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        jTabbedPane1.addTab("Karaoke", jPanel4);

        panelGestion.add(jTabbedPane1);

        tabbedpanePrincipal.addTab("Gestión", panelGestion);

        panelInformacion.setLayout(new java.awt.GridLayout(1, 0));

        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        tablaInfoTopCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Título", "Autor", "Reproducciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaInfoTopCanciones);

        jPanel9.add(jScrollPane4);

        jTabbedPane2.addTab("Top canciones", jPanel9);

        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        tablaInfoTopCantantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Nombre", "Canciones cantadas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tablaInfoTopCantantes);

        jPanel10.add(jScrollPane5);

        jTabbedPane2.addTab("Top cantantes", jPanel10);

        panelBuscarPorFecha.setLayout(new java.awt.BorderLayout());

        tablaInfoBuscarFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Canción", "Autor", "Reproducciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tablaInfoBuscarFecha);

        panelBuscarPorFecha.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        panelCalendario.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 15, 10));

        jLabel4.setText("Seleccione una fecha: ");
        panelCalendario.add(jLabel4);

        jDateChooser1.setToolTipText("");
        jDateChooser1.setDate(new Date());
        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setMaxSelectableDate(new java.util.Date(2524611671000L));
        jDateChooser1.setMinSelectableDate(new java.util.Date(-631148329000L));
        jDateChooser1.setPreferredSize(new java.awt.Dimension(250, 25));
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        panelCalendario.add(jDateChooser1);

        panelBuscarPorFecha.add(panelCalendario, java.awt.BorderLayout.PAGE_START);

        jTabbedPane2.addTab("Buscar por fecha", panelBuscarPorFecha);

        panelInformacion.add(jTabbedPane2);

        tabbedpanePrincipal.addTab("Información", panelInformacion);

        getContentPane().add(tabbedpanePrincipal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Usuario usu = (Usuario) comboBoxUsuarios.getSelectedItem();
        Usuario usuTemp = logica.LogicaConexion.getUsuarioController().findUsuario(usu.getId());
        Cancion can = (Cancion) comboBoxCanciones.getSelectedItem();
        Cancion canTemp = logica.LogicaConexion.getCancionController().findCancion(can.getId());
        Karaoke karaoke = new Karaoke(canTemp, usuTemp, new Date());
        logica.LogicaConexion.getKaraokeController().create(karaoke);
        logica.logicaDatos.actualizarDatos();
        JOptionPane.showMessageDialog(this, "Karaoke iniciado con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        logica.logicaDatos.actualizarDatos();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        logica.logicaDatos.actualizarDatos();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        logica.logicaDatos.actualizarDatos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonAnnadirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnnadirUsuarioActionPerformed
        new gui.dialogosCRUD.UsuarioDialogo(this, true, gui.dialogosCRUD.UsuarioDialogo.CREACION, null).setVisible(true);
    }//GEN-LAST:event_botonAnnadirUsuarioActionPerformed

    private void botonEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarUsuarioActionPerformed

        if (getTablaGestionUsuarios().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para poder editarla");
        } else {
            new gui.dialogosCRUD.UsuarioDialogo(this, true, gui.dialogosCRUD.UsuarioDialogo.EDICION,
                    logica.LogicaConexion.getUsuarioController().findUsuario(
                            Integer.parseInt(logica.logicaDatos.getDtmUsuarios().getValueAt(
                                    getTablaGestionUsuarios().getSelectedRow(), 0).toString()))).setVisible(true);
        }
    }//GEN-LAST:event_botonEditarUsuarioActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (getTablaGestionUsuarios().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para poder eliminarla");
        } else {
            if (JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar el usuario seleccionado y todos sus karaokes?") == 0) {
                try {
                    logica.LogicaConexion.getUsuarioController().destroy(
                            Integer.parseInt(logica.logicaDatos.getDtmUsuarios().getValueAt(
                                    getTablaGestionUsuarios().getSelectedRow(), 0).toString()));
                    logica.logicaDatos.actualizarDatos();
                } catch (NonexistentEntityException ex) {
                    Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        tabbedpanePrincipal.setSelectedIndex(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (getTablaGestionCanciones().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para poder eliminarla");
        } else {
            if (JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar la canción seleccionada y todos sus karaokes?") == 0) {
                try {
                    logica.LogicaConexion.getCancionController().destroy(
                            Integer.parseInt(logica.logicaDatos.getDtmCanciones().getValueAt(
                                    getTablaGestionCanciones().getSelectedRow(), 0).toString()));
                    logica.logicaDatos.actualizarDatos();
                } catch (NonexistentEntityException ex) {
                    Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (getTablaGestionKaraokes().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para poder eliminarla");
        } else {
            if (JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar el karaoke seleccionado?") == 0) {
                try {
                    logica.LogicaConexion.getKaraokeController().destroy(
                            Integer.parseInt(logica.logicaDatos.getDtmKaraokes().getValueAt(
                                    getTablaGestionKaraokes().getSelectedRow(), 0).toString()));
                    logica.logicaDatos.actualizarDatos();
                } catch (NonexistentEntityException ex) {
                    Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (getTablaGestionCanciones().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para poder editarla");
        } else {
            new gui.dialogosCRUD.CancionDialogo(this, true, gui.dialogosCRUD.CancionDialogo.EDICION,
                    logica.LogicaConexion.getCancionController().findCancion(
                            Integer.parseInt(logica.logicaDatos.getDtmCanciones().getValueAt(
                                    getTablaGestionCanciones().getSelectedRow(), 0).toString()))).setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new gui.dialogosCRUD.CancionDialogo(this, true, gui.dialogosCRUD.CancionDialogo.CREACION, null).setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new gui.dialogosCRUD.KaraokeDialogo(this, true, logica.LogicaConexion.getKaraokeController().findKaraoke(
                Integer.parseInt(logica.logicaDatos.getDtmKaraokes().getValueAt(
                        getTablaGestionKaraokes().getSelectedRow(), 0).toString()))).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange

        ((DefaultTableModel) getTablaInfoBuscarFecha().getModel()).setRowCount(0);
        if (jDateChooser1.getDate() != null && logica.LogicaConexion.getMan() != null) {
            List<Object[]> karaokesPorFecha = (List<Object[]>) logica.LogicaConexion.getMan()
                    .createQuery("SELECT c.titulo, c.autor, count(k.cancion.id) FROM Cancion c JOIN c.listaKaraokes k WHERE date(k.fecha) = date(:fecha) GROUP BY c.titulo ORDER BY count(k.cancion.id) desc")
                    .setParameter("fecha", jDateChooser1.getDate()).getResultList();

            for (Object[] karaoke : karaokesPorFecha) {
                ((DefaultTableModel) getTablaInfoBuscarFecha().getModel()).addRow(karaoke);
            }
            System.out.println(new SimpleDateFormat("dd-MM-yyy hh:mm:ss").format(jDateChooser1.getDate()));
        }

    }//GEN-LAST:event_jDateChooser1PropertyChange

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Aplicacion().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public JComboBox<String> getComboBoxCanciones() {
        return comboBoxCanciones;
    }

    public JComboBox<String> getComboBoxUsuarios() {
        return comboBoxUsuarios;
    }

    public JTable getTablaGestionCanciones() {
        return tablaGestionCanciones;
    }

    public JTable getTablaGestionKaraokes() {
        return tablaGestionKaraokes;
    }

    public JTable getTablaGestionUsuarios() {
        return tablaGestionUsuarios;
    }

    public JTable getTablaInfoBuscarFecha() {
        return tablaInfoBuscarFecha;
    }

    public JTable getTablaInfoTopCanciones() {
        return tablaInfoTopCanciones;
    }

    public JTable getTablaInfoTopCantantes() {
        return tablaInfoTopCantantes;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnnadirUsuario;
    private javax.swing.JButton botonEditarUsuario;
    private javax.swing.JComboBox<String> comboBoxCanciones;
    private javax.swing.JComboBox<String> comboBoxUsuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel panelBuscarPorFecha;
    private javax.swing.JPanel panelCalendario;
    private javax.swing.JPanel panelGestion;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JPanel panelKaraoke;
    private javax.swing.JTabbedPane tabbedpanePrincipal;
    private javax.swing.JTable tablaGestionCanciones;
    private javax.swing.JTable tablaGestionKaraokes;
    private javax.swing.JTable tablaGestionUsuarios;
    private javax.swing.JTable tablaInfoBuscarFecha;
    private javax.swing.JTable tablaInfoTopCanciones;
    private javax.swing.JTable tablaInfoTopCantantes;
    // End of variables declaration//GEN-END:variables
}
