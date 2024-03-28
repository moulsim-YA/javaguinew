

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



import java.awt.event.MouseEvent;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Oy
 */
public class ServerGUI extends javax.swing.JFrame {
    private int port;
    private boolean ready;
    private boolean stop;
    /**
     * Creates new form NewJFrame1
     */
    public ServerGUI() {
        initComponents();
        this.port = 5000;
        this.ready = false;
        this.stop = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serverPort = new javax.swing.JTextField();
        Start = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 462));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examples/icons/icons8-chat-60(1).png"))); // NOI18N
        jLabel1.setText("WEEchat");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examples/icons/icons8-server-40.png"))); // NOI18N
        jLabel2.setText("SERVER");

        serverPort.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        serverPort.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        serverPort.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        serverPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverPortActionPerformed(evt);
            }
        });

        Start.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examples/icons/icons8-start-45.png"))); // NOI18N
        Start.setText("START");
        Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                start_pressed(evt);
            }
        });

        display.setEditable(false);
        display.setBackground(new java.awt.Color(255, 255, 255));
        display.setColumns(20);
        display.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Start, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(serverPort, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(501, 501, 501))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(serverPort, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void start_pressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_pressed
        ready = true;        // TODO add your handling code here:
    }//GEN-LAST:event_start_pressed

    private void serverPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serverPortActionPerformed

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
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        ServerGUI server = new ServerGUI();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            server.setVisible(true);
        });
        
        while(server.ready == false){
            System.out.println(server.ready);
            
        
            if(server.ready == true){
                System.out.println(server.ready);
                server.display.append(">> Server Initiated\n");

                if(!server.serverPort.getText().isEmpty()){
                    server.port = Integer.parseInt(server.serverPort.getText());
                }
                System.out.println(server.port);
                List<FileServerThread> threadList = new ArrayList<>();

                try (ServerSocket serverSocket = new ServerSocket(server.port)) {
                    while (true) {
               
                        Socket socket = serverSocket.accept();
                        server.display.append(">> New Client Joined The Chat : " +socket.getInetAddress()+"!\n");
                        FileServerThread fileServerThread = new FileServerThread(socket, threadList,server.display);
                        threadList.add(fileServerThread);
                        fileServerThread.start();
                    }
                } catch (IOException e) {
                    server.display.append("Server Failed");
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Start;
    private javax.swing.JTextArea display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField serverPort;
    // End of variables declaration//GEN-END:variables
}

class FileServerThread extends Thread {
    private Socket socket;
    private List<FileServerThread> threadList;
    private BufferedReader input;
    private PrintWriter output;
    private DataInputStream fileInput;
    private DataOutputStream file_out;
    private String fileName;
    private int number;
    private javax.swing.JTextArea display;
    private String message;
    private boolean finished;
    private String ext;
    private HashMap<String, Boolean> dictionary;
    
   
    public FileServerThread(Socket socket, List<FileServerThread> threadList, javax.swing.JTextArea display) {
        this.socket = socket;
        this.threadList = threadList;
        this.number = 0;
        this.fileName = "file";
        this.display = display;
        this.message = "";
        this.finished = false;
        this.ext = ".txt";
        dictionary = new HashMap<String, Boolean>() {{
        }};

        try {
            this.input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.output = new PrintWriter(socket.getOutputStream(), true);
            this.fileInput = new DataInputStream(socket.getInputStream());
            this.file_out = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    /*private static void sendFile(String path, DataOutputStream file_out,javax.swing.JTextArea display ) {
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            File file = new File(path);

            // send file size
            file_out.writeLong(file.length());
            file_out.flush();

            // break file into chunks
            byte[] buffer = new byte[4 * 1024];
            int bytes;
            while ((bytes = fileInputStream.read(buffer)) != -1) {
                file_out.write(buffer, 0, bytes);
                file_out.flush();
                if((bytes = fileInputStream.read(buffer)) != -1){
                    System.out.println("whoop");
                }
                
            }

            // Ensure all data is sent before closing the stream
            file_out.flush();
            display.append("File Transfer Completed\n");
        } catch (Exception e) {
            display.append("File Transfer Failed\n");
              // Handle the exception appropriately
        }
    }

    private void receiveFile(String folder, String fileName, DataInputStream fileInput) throws IOException {
        int bytes = 0;
        String path = folder + fileName;
        File file = new File(path);

        // Extract the directory path without the file name
        String directoryPath = file.getParent();
        File directory = new File(directoryPath);

        // Check if the directory exists, create it if not
        if (!directory.exists()) {
            directory.mkdirs();
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            long size = fileInput.readLong();
            System.out.println(size);
            // read file size
            byte[] buffer = new byte[4 * 1024];
            while (size > 0) {
                
                int bytesRead = fileInput.read(buffer, 0, (int) Math.min(buffer.length, size));
                if (bytesRead == -1) {
                    throw new IOException("Unexpected end of stream while reading file content.");
                }
                fileOutputStream.write(buffer, 0, bytesRead);
                size -= bytesRead; // decrement remaining file size
                if(size <= 0){
                    break;
                }
            }
            if(size<=0){
                this.finished = true;
                System.out.println("Finished True");
                
            }
        }
    }
    */
   

    
    public static void sendFile(File file, OutputStream outputStream,FileServerThread thread_) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            byte[] buffer = new byte[1024];
            fileInputStream = new FileInputStream(file);
            long startTime = System.currentTimeMillis();
            while ((System.currentTimeMillis() - startTime) < 5000) {
                int bytesRead = fileInputStream.read(buffer);
                if (bytesRead == -1) {
                    break; // End of file
                }
                thread_.file_out.write(buffer, 0, bytesRead);
            
            }
            System.out.println("file sent");
            thread_.file_out.flush();
        }catch(IOException e){
            System.out.println("Sending failed");
        }
        finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            
          
        }
    }
    
    public static void receiveFile(File file, InputStream inputStream) throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            byte[] buffer = new byte[1024];
            int bytesRead;
            fileOutputStream = new FileOutputStream(file);
            long startTime = System.currentTimeMillis();
            while ((System.currentTimeMillis() - startTime) < 5000) {
                if (inputStream.available() > 0) {
                    bytesRead = inputStream.read(buffer);
                    if (bytesRead == -1) {
                        break;  // End of stream
                    }
                    fileOutputStream.write(buffer, 0, bytesRead);
                } 
            }
            System.out.println("wohoooooo");
            fileOutputStream.flush();
        }finally {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            
        }
    
    }
    

    

    @Override
    public void run() {
        try {
        
            while (true) {
                
                message = input.readLine();
                if(message.startsWith("file:")){
                    ext =  extension(message);
                    fileName = "file"+number+"."+ext;
                    String path = "C:/Users/Oy/Desktop/server_files/"+fileName;
                    File file = new File(path);
                    receiveFile(file,fileInput);
                    //receiveFile("C:/Users/Oy/Desktop/server_files/",fileName, fileInput);
                  
                    broadcast("file:"+path);
                    broadcast_file(file,file_out);
                    System.out.println("file broadcast acheived");
                    //broadcast("C:/Users/Oy/Desktop/server_files/"+fileName,"Text","C:/Users/Oy/Desktop/server_files/"+fileName,file_out,display);  
                        
                    
                    
                    number += 1;              
                }
                else if(message.equals("exit")){
                    display.append(">> "+socket.getInetAddress()+ " left the server !\n");
                    threadList.remove(this);
                    
                }
                else{
                    
                   
                    display.append(">> "+message+"\n");
                    broadcast(message);
                }
                
                
                message = "";
                
                
                
                
                
              
            }
        } catch (IOException e) {
            System.out.println("Thread failed!");
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println("Error");
            }
        }
    }

    /*private void broadcast(String message, String type,String path, DataOutputStream file_out,javax.swing.JTextArea display) {
        for (var thread : threadList) {
            if (thread != this) {
                if(type.equals("File")){
                    System.out.println("File");
                    thread.sendFile(path,file_out,display);
                }
                else if(type.equals("Text")){
                    System.out.println("Text");
                    thread.output.println(message);
                }
                
            }
        }
    }*/
    private void broadcast(String message){
        for (FileServerThread thread : threadList) {
            if (thread != this) {
                thread.output.println(message);
            }
        }
    }
    private void broadcast_file(File file,DataOutputStream file_out) throws IOException{
        for (FileServerThread thread : threadList) {
            if (thread != this) {
                sendFile(file,file_out,thread);
            }
        }  
    }

   
   
    private String extension(String the_mssg){
        int dotIndex = the_mssg.lastIndexOf('.');
        String fileExtension = "";
        // Check if a dot was found and if it's not the last character in the file name
        if (dotIndex > 0 && dotIndex < the_mssg.length() - 1) {
            // Extract the file extension
            fileExtension = the_mssg.substring(dotIndex + 1);
            System.out.println("File Extension: " + fileExtension);
        } else {
            System.out.println("No file extension found");
        }
        return fileExtension; 
    }
}