from tkinter import *

menu_inicial = Tk()
menu_inicial.title("Sistema de Login")
menu_inicial.geometry('350x170+520+170')
menu_inicial.resizable(False, False)


# Rótulos
Label1 = Label(menu_inicial, text="Usuário:", font="Arial 12", fg="black")
Label1.grid(row=0, column=0, padx=0, pady=0)
label2 = Label(menu_inicial, text="Senha:", font="Arial 12", fg="black")
label2.grid(row=1, column=0, padx=0, pady=0, sticky= 'w')
# Label1.pack()
# label2.place(x=10, y=50) #coloca o label2 em posição por coordenadas x e y


# Caixas de texto
txtUsuario = Entry(menu_inicial, font = "Arial 12", fg="black")
txtUsuario.grid(row=0, column=1, padx=10, pady=10, sticky='w')

txtSenha = Entry(menu_inicial, font = "Arial 12", fg="black", show='*')  # 'show' oculta o texto digitado
txtSenha.grid(row=1, column=1, padx=10, pady=10, sticky = 'w')

# Botões
btLogin = Button(menu_inicial, text = "Entrar", font = "Arial 12")
btLogin.grid(row=2, column=1, padx=0, pady=10, sticky= W)

btCancelar = Button(menu_inicial, text = "Cancelar", font = "Arial 12")
btCancelar.grid(row=2, column=1, padx=0, pady=10, sticky = E)




menu_inicial.mainloop()

