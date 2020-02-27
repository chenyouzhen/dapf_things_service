import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'factory',
        loadChildren: () => import('./factory/factory.module').then(m => m.DapfThingsServiceFactoryModule)
      },
      {
        path: 'product',
        loadChildren: () => import('./product/product.module').then(m => m.DapfThingsServiceProductModule)
      },
      {
        path: 'assembly-line',
        loadChildren: () => import('./assembly-line/assembly-line.module').then(m => m.DapfThingsServiceAssemblyLineModule)
      },
      {
        path: 'observation',
        loadChildren: () => import('./observation/observation.module').then(m => m.DapfThingsServiceObservationModule)
      },
      {
        path: 'alarm',
        loadChildren: () => import('./alarm/alarm.module').then(m => m.DapfThingsServiceAlarmModule)
      },
      {
        path: 'kpi',
        loadChildren: () => import('./kpi/kpi.module').then(m => m.DapfThingsServiceKpiModule)
      },
      {
        path: 'record',
        loadChildren: () => import('./record/record.module').then(m => m.DapfThingsServiceRecordModule)
      },
      {
        path: 'link',
        loadChildren: () => import('./link/link.module').then(m => m.DapfThingsServiceLinkModule)
      }
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ])
  ]
})
export class DapfThingsServiceEntityModule {}
