import java.awt.*;
import javax.swing.*;

public class SnakeGame extends JFrame {

    public SnakeGame() {
        // Tạo một đối tượng GamePanel, nơi chứa toàn bộ logic và đồ họa của trò chơi
        GamePanel gamePanel = new GamePanel();

        // Đặt LayoutManager cho JFrame
        this.setLayout(new BorderLayout());

        // Thêm GamePanel vào trung tâm của BorderLayout
        this.add(gamePanel, BorderLayout.CENTER);

        // Đặt tiêu đề cho cửa sổ trò chơi
        this.setTitle("Rắn Săn Mồi");

        // Đặt hoạt động mặc định khi đóng cửa sổ là thoát ứng dụng
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Không cho phép người dùng thay đổi kích thước cửa sổ
        this.setResizable(false);

        // Tự động điều chỉnh kích thước cửa sổ để vừa với các thành phần bên trong
        this.pack();

        // Đặt cửa sổ ở giữa màn hình
        this.setLocationRelativeTo(null);

        // Hiển thị cửa sổ
        this.setVisible(true);
    }

    /**
     * Phương thức main để khởi chạy trò chơi
     * @param args Tham số dòng lệnh (không sử dụng trong trường hợp này)
     */
    public static void main(String[] args) {
        // Tạo một thể hiện của lớp SnakeGame trên luồng sự kiện của Swing
        // Điều này đảm bảo rằng tất cả các thao tác liên quan đến GUI đều an toàn trên luồng
        new SnakeGame();
    }
}