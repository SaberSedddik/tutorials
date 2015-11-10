package sample.simplejbehave;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.junit.JUnitStories;

public class SimpleJBehaveJUnit extends JUnitStories {

    public SimpleJBehaveJUnit() {
        super();
        this.configuredEmbedder().candidateSteps().add(new ExampleSteps());
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("sample/simplejbehave/Math.story");
    }
}
