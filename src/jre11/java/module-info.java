import com.jwebmp.core.databind.IOnComponentAdded;
import com.jwebmp.plugins.bootstrap.implementations.*;

module com.jwebmp.plugins.bootstrap {

	requires transitive com.jwebmp.core.angular;
	
	requires com.google.common;
	
	requires com.guicedee.guicedinjection;
	
	exports com.jwebmp.plugins.bootstrap;
	exports com.jwebmp.plugins.bootstrap.accordion;
	exports com.jwebmp.plugins.bootstrap.alerts.events;
	exports com.jwebmp.plugins.bootstrap.alerts.styles;
	exports com.jwebmp.plugins.bootstrap.alerts;
	exports com.jwebmp.plugins.bootstrap.badge;
	exports com.jwebmp.plugins.bootstrap.badge.styles;
	exports com.jwebmp.plugins.bootstrap.breadcrumbs;
	exports com.jwebmp.plugins.bootstrap.buttons;
	exports com.jwebmp.plugins.bootstrap.buttons.checkbox.styles;
	exports com.jwebmp.plugins.bootstrap.buttons.checkbox;
	exports com.jwebmp.plugins.bootstrap.buttons.groups;
	exports com.jwebmp.plugins.bootstrap.buttons.groups.interfaces;
	exports com.jwebmp.plugins.bootstrap.buttons.groups.options;
	exports com.jwebmp.plugins.bootstrap.buttons.radio.styles;
	exports com.jwebmp.plugins.bootstrap.buttons.radio;
	exports com.jwebmp.plugins.bootstrap.buttons.switches;
	exports com.jwebmp.plugins.bootstrap.buttons.styles;
	exports com.jwebmp.plugins.bootstrap.buttons.toolbars;
	exports com.jwebmp.plugins.bootstrap.cards;
	exports com.jwebmp.plugins.bootstrap.cards.layout;
	exports com.jwebmp.plugins.bootstrap.cards.parts;
	exports com.jwebmp.plugins.bootstrap.cards.parts.interfaces;
	exports com.jwebmp.plugins.bootstrap.cards.parts.styles;
	exports com.jwebmp.plugins.bootstrap.cards.prebuilt;
	exports com.jwebmp.plugins.bootstrap.cards.themed;
	exports com.jwebmp.plugins.bootstrap.carousel;
	exports com.jwebmp.plugins.bootstrap.carousel.parts;
	exports com.jwebmp.plugins.bootstrap.carousel.events;
	exports com.jwebmp.plugins.bootstrap.carousel.features;
	exports com.jwebmp.plugins.bootstrap.carousel.options;
	exports com.jwebmp.plugins.bootstrap.close;
	exports com.jwebmp.plugins.bootstrap.collapse;
	exports com.jwebmp.plugins.bootstrap.collapse.features;
	exports com.jwebmp.plugins.bootstrap.containers;
	exports com.jwebmp.plugins.bootstrap.dropdown;
	exports com.jwebmp.plugins.bootstrap.dropdown.parts;
	exports com.jwebmp.plugins.bootstrap.dropdown.interfaces;
	exports com.jwebmp.plugins.bootstrap.dropdown.options;
	//exports com.jwebmp.plugins.bootstrap4.enumerations;
	exports com.jwebmp.plugins.bootstrap.figures;
	exports com.jwebmp.plugins.bootstrap.forms;
	exports com.jwebmp.plugins.bootstrap.forms.groups;
	exports com.jwebmp.plugins.bootstrap.forms.groups.enumerations;
	exports com.jwebmp.plugins.bootstrap.forms.groups.sets;
	exports com.jwebmp.plugins.bootstrap.forms.groups.sets.parts;
	exports com.jwebmp.plugins.bootstrap.forms.controls;
	exports com.jwebmp.plugins.bootstrap.forms.interfaces;
	exports com.jwebmp.plugins.bootstrap.images;
	exports com.jwebmp.plugins.bootstrap.jumbotron;
	exports com.jwebmp.plugins.bootstrap.jumbotron.interfaces;
	exports com.jwebmp.plugins.bootstrap.listgroup;
	exports com.jwebmp.plugins.bootstrap.listgroup.parts;

	exports com.jwebmp.plugins.bootstrap.media;
	exports com.jwebmp.plugins.bootstrap.media.parts;
	exports com.jwebmp.plugins.bootstrap.modal;
	exports com.jwebmp.plugins.bootstrap.modal.events.hidden;
	exports com.jwebmp.plugins.bootstrap.modal.events.hide;
	exports com.jwebmp.plugins.bootstrap.modal.events.show;
	exports com.jwebmp.plugins.bootstrap.modal.events.shown;
	exports com.jwebmp.plugins.bootstrap.modal.parts;

	exports com.jwebmp.plugins.bootstrap.navbar;
	exports com.jwebmp.plugins.bootstrap.navbar.parts;
	exports com.jwebmp.plugins.bootstrap.navbar.enumerations;
	exports com.jwebmp.plugins.bootstrap.navbar.interfaces;
exports com.jwebmp.plugins.bootstrap.navbar.toggler;
	exports com.jwebmp.plugins.bootstrap.navs;
	exports com.jwebmp.plugins.bootstrap.navs.parts;
	exports com.jwebmp.plugins.bootstrap.navs.interfaces;
	exports com.jwebmp.plugins.bootstrap.options;
	exports com.jwebmp.plugins.bootstrap.options.interfaces;
	exports com.jwebmp.plugins.bootstrap.pagination;
	exports com.jwebmp.plugins.bootstrap.pagination.parts;
	exports com.jwebmp.plugins.bootstrap.pagination.options;
	exports com.jwebmp.plugins.bootstrap.popovers;
	exports com.jwebmp.plugins.bootstrap.popovers.interfaces;
	exports com.jwebmp.plugins.bootstrap.progressbar;
//	exports com.jwebmp.plugins.bootstrap.progressbar.bar;
	exports com.jwebmp.plugins.bootstrap.progressbar.interfaces;
	exports com.jwebmp.plugins.bootstrap.select;
	exports com.jwebmp.plugins.bootstrap.range;
	exports com.jwebmp.plugins.bootstrap.tables;
	exports com.jwebmp.plugins.bootstrap.toggle;
	exports com.jwebmp.plugins.bootstrap.toasts;
	exports com.jwebmp.plugins.bootstrap.toasts.features;
	exports com.jwebmp.plugins.bootstrap.toasts.events;
	exports com.jwebmp.plugins.bootstrap.timepicker;
//	exports com.jwebmp.plugins.bootstrap.tooltips;
	
	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bootstrap.BootstrapPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with BootstrapModuleInclusion;
	provides IOnComponentAdded with OnBootstrapComponentAdded;
	
	
	opens com.jwebmp.plugins.bootstrap to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.accordion to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.alerts.events to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.alerts.styles to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.alerts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.badge to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.badge.styles to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.breadcrumbs to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.buttons to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.buttons.checkbox.styles to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.buttons.checkbox to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.buttons.groups to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.buttons.groups.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.buttons.groups.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.buttons.radio.styles to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.buttons.radio to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.buttons.styles to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.buttons.toolbars to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.cards to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.cards.layout to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.cards.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.cards.parts.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.cards.parts.styles to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.cards.prebuilt to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.cards.themed to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.carousel to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.carousel.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.carousel.events to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.carousel.features to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.carousel.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.close to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.collapse to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.collapse.events.hidden to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.collapse.events.hide to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.collapse.events.show to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.collapse.events.shown to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.collapse.features to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.containers to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.dropdown to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.dropdown.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.dropdown.events.hidden to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.dropdown.events.hide to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.dropdown.events.show to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.dropdown.events.shown to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.dropdown.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.dropdown.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.figures to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.forms to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.forms.groups to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.forms.groups.enumerations to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.forms.groups.sets to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.forms.groups.sets.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.forms.controls to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.forms.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.images to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.implementations to com.google.guice, com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.jumbotron to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.jumbotron.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.listgroup to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.listgroup.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.navbar.toggler to com.fasterxml.jackson.databind, com.jwebmp.core;

	opens com.jwebmp.plugins.bootstrap.media to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.media.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.modal to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.modal.events.hidden to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.modal.events.hide to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.modal.events.show to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.modal.events.shown to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.modal.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
//	opens com.jwebmp.plugins.bootstrap.modal.features to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.navbar to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.navbar.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.navbar.enumerations to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.navbar.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.navs to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.navs.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.navs.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.select to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.options.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.pagination to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.pagination.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.pagination.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.popovers to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.popovers.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.progressbar to com.fasterxml.jackson.databind, com.jwebmp.core;
//	opens com.jwebmp.plugins.bootstrap.progressbar.bar to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.progressbar.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.range to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.tables to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.toasts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.toasts.features to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.toasts.events to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.toggle to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.timepicker to com.fasterxml.jackson.databind, com.jwebmp.core;
//	opens com.jwebmp.plugins.bootstrap.tooltips to com.fasterxml.jackson.databind, com.jwebmp.core;
}
