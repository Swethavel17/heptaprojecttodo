import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { SignupComponent } from './signup/signup.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactComponent } from './contact/contact.component';
import { TodosComponent } from './components/todos/todos.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path:"home",component:HomeComponent},
  {path:"signup",component:SignupComponent},
  {path:"aboutus",component:AboutusComponent},
  {path:"contact",component:ContactComponent},
  {path:"todos",component:TodosComponent},
  {path:"login",component:LoginComponent}
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

