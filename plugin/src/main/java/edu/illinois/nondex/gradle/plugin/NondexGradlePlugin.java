package edu.illinois.nondex.gradle.plugin;

import edu.illinois.nondex.gradle.tasks.NondexTest;
import org.gradle.api.Project;
import org.gradle.api.Plugin;

/**
 * A simple 'hello world' plugin.
 */
public class NondexGradlePlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getTasks().create(NondexTest.getNAME(), NondexTest.class).init();
    }
}
