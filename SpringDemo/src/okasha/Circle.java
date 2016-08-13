package okasha;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Circle implements Shape {
	private Point center;
	@Autowired
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}
    @Resource
	public void setCenter(Point center) {
		this.center = center;
	}
    @Override
	public void draw() {
		System.out.println("Circle Drwaing \nThis is circle center:(" + center.getX() + ", " + center.getY() + ")");
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default drawing.circle", null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[]{center.getX(), center.getY()}, "Default drawing.point", null));

    }
}