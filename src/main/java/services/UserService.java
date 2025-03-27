package services;

import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.IUserRepository;

import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class UserService {

    @Autowired
    IUserRepository repository;

    //Listar los metodos que activaran las consultas en la base de datos

    //guardar
    public User saveUser(User dataUser)throws Exception{
        try{
            // validar los datos de entrada
            return this.repository.save(dataUser);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //buscar todos los registros
    public List<User> searchAllUsers()throws Exception{
        try{
            return this.repository.findAll();

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //buscar por id
    public User searchUerById(Integer idUser )throws Exception{
        try{
            Optional<User> searchedUser=this.repository.findById(idUser);
            if(searchedUser.isPresent()){
                return searchedUser.get();
            }else{
                throw new Exception("El usuario consultado no esta en BD");
            }
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //modificar por id
    public User modifyUser(Integer id, User dataUser) throws Exception{
        Optional<User> searchedUser=this.repository.findById(id);
        try{
        if(searchedUser.isPresent()){
            searchedUser.get().setPhone(dataUser.getPhone());
            searchedUser.get().setEmail(dataUser.getEmail());
            return this.repository.save(searchedUser.get());
        }else{
            throw new Exception("usuario no ecnontrado");
        }
    }catch(Exception error){
        throw new Exception(error.getMessage());
    }
}

    //eliminar por id
    public boolean deleteUser(Integer id) throws Exception{
        try{
            Optional<User> searchedUser=this.repository.findById(id);
            if(searchedUser.isPresent()){
                this.repository.deletedById(id);
                return true;
            }else{
                throw new Exception("usuario no ecnontrado");
            }
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
