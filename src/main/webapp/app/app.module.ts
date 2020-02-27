import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { DapfThingsServiceSharedModule } from 'app/shared/shared.module';
import { DapfThingsServiceCoreModule } from 'app/core/core.module';
import { DapfThingsServiceAppRoutingModule } from './app-routing.module';
import { DapfThingsServiceHomeModule } from './home/home.module';
import { DapfThingsServiceEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    DapfThingsServiceSharedModule,
    DapfThingsServiceCoreModule,
    DapfThingsServiceHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    DapfThingsServiceEntityModule,
    DapfThingsServiceAppRoutingModule
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, FooterComponent],
  bootstrap: [MainComponent]
})
export class DapfThingsServiceAppModule {}
