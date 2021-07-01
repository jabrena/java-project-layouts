package info.jab.microservices.archunit;

import com.tngtech.archunit.core.importer.ImportOption.DoNotIncludeTests;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchIgnore;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import info.jab.microservices.MainApplication;
import org.junit.jupiter.api.Disabled;

import static com.tngtech.archunit.library.Architectures.onionArchitecture;
import static info.jab.microservices.archunit.OnionArchitectureTest.PACKAGE;

@AnalyzeClasses(packages = PACKAGE, importOptions = { DoNotIncludeTests.class })
public class OnionArchitectureTest {

    public static final String PACKAGE = "info.jab.microservices";

    @ArchIgnore
    @ArchTest
    private final ArchRule classes_are_under_packages = ArchRuleDefinition.classes()
            .should()
            .resideInAnyPackage(PACKAGE, "..application..", "..domain..", "..adapters..")
            .orShould()
            .be(MainApplication.class);

    @ArchIgnore
    @ArchTest
    static final ArchRule layer_dependencies_are_respected = onionArchitecture()
            .domainModels("info.jab.microservices.domain.model..")
            .domainServices("info.jab.microservices.domain.service..")
            .applicationServices("info.jab.microservices.application..")
            .adapter("persistence", "info.jab.microservices.adapters.persistence..")
            .adapter("rest", "info.jab.microservices.adapters.rest..");
}
