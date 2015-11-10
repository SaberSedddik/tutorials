package sample.simplejbehave;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;

public class SimpleJBehaveMain {

    private static Embedder embedder = new Embedder();
    private static List<String> storyPaths = Arrays
            .asList("sample/simplejbehave/Math.story");

    public static void main(String[] args) {
        embedder.candidateSteps().add(new ExampleSteps());


        embedder.configuration().useStoryReporterBuilder(new StoryReporterBuilder().withFormats(Format.CONSOLE));
        embedder.runStoriesAsPaths(storyPaths);
    }
}