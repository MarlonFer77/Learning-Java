package com.soulcode.servicos.Controllers;

import com.soulcode.servicos.Models.Funcionario;
import com.soulcode.servicos.Services.FuncionarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("servicos")
public class FuncionarioController {

    @Autowired
    FuncionarioServices funcionarioServices;

    @GetMapping("/funcionarios")
    public List<Funcionario> mostrarTodosFuncionarios(){
        List<Funcionario> funcionarios = funcionarioServices.mostrarTodosFuncionarios();
        return funcionarios;
    }

    @GetMapping("/funcionarios/{idFuncionario}")
    public ResponseEntity<Funcionario> mostrarUmFuncionarioPeloId(@PathVariable Integer idFuncionario){
        Funcionario funcionario = funcionarioServices.mostrarUmFuncionarioPeloId(idFuncionario);
        return ResponseEntity.ok().body(funcionario);
    }

    @GetMapping("/funcionariosEmail/{emailFuncionario}")
    public ResponseEntity<Funcionario> mostrarUmFuncionarioPeloEmail(@PathVariable String emailFuncionario){
        Funcionario funcionario = funcionarioServices.mostrarUmFuncionarioPeloEmail(emailFuncionario);
        return  ResponseEntity.ok().body(funcionario);
    }

    @PostMapping("/funcionarios")
    public ResponseEntity<Funcionario> cadastrarFuncionario(@RequestBody Funcionario funcionario){

        // nessa linha 42, o funcionário já é salvo na tabela do databse
        // agora precisamos criar uma url para esse novo registro da tabela


        funcionario = funcionarioServices.cadastrarFuncionario(funcionario);
        URI novaUri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("id")
                .buildAndExpand(funcionario.getIdFuncionario())
                .toUri();

        return ResponseEntity.created(novaUri).body(funcionario);
    }

}
