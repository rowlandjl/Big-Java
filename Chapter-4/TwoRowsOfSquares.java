import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

// This program draws two rows of squares.

public class TwoRowsOfSquares
{
  public static void draw(Graphics g)
  {
    final int width = 20;
    g.setColor(Color.RED);

    // Top row. Note that top left corner of the drawing has coordinates (0, 0)
    int x = 0;
    int y = 0;
    for (int i = 0; i < 10; i++)
    {
      g.drawRect(x, y, width, width);
      x = x + 2 * width;
    }

    // Second row, offset from the first one
    x = width;
    y = width;
    for (int i = 0; i < 10; i++)
    {
      g.drawRect(x, y, width, width);
      x = x + 2 * width;
    }
  }

  public static void main(String[] args)
  {
    JFrame frame = new JFrame();

    final int FRAME_WIDTH = 400;
    final int FRAME_HEIGHT = 400;

    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JComponent component = new JComponent()
    {
      public void paintComponenet(Graphics graph)
      {
        draw(graph);
      }
    };

    frame.add(component);
    frame.setVisible(true);
  }
}
